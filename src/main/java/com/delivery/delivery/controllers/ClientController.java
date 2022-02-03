package com.delivery.delivery.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.delivery.delivery.model.Client;
import com.delivery.delivery.repositories.ClientRepository;


@Controller
public class ClientController {
	
	@Autowired
	private ClientRepository repository;
	
	@GetMapping("/comprar")
	public ModelAndView index( Client client) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("comprar/comprar");
		mv.addObject("compra",  new Client());
		return mv;
	}
	
	@PostMapping("/comprar")
	public ModelAndView enviar(Client client) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/comprar");
		repository.save(client);
		return mv;
	}
	
	
}
