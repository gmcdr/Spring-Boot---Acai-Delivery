package com.delivery.delivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delivery.delivery.model.Client;

public interface ClientRepository extends  JpaRepository<Client, Integer> {

}
