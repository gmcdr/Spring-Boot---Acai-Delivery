package com.delivery.delivery.enums;

public enum Payment {
		CARTAO("Cartão"),
		DINHEIRO("Dinheiro"),
		PIX("Pix");
	
		private String payment;
		
		private Payment(String payment) {
			this.payment = payment;
		}
		
		
}
