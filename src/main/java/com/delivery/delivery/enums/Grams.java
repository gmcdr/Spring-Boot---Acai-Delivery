package com.delivery.delivery.enums;

public enum Grams {
		_100g("10,00"),
		_200g("15,00"),
		_300g("20,00"),
		_400g("25,00"),
		_500g("30,00"),
		_600g("35,00"),
		_700g("40,00");
	
		private String grams;

		private Grams(String grams) {
			this.grams = grams;
		}

		public String getGrams() {
			return grams;
		}

		public void setGrams(String grams) {
			this.grams = grams;
		}
		
}
