package com.dilaraalk.model;

public class Test {
	
	public static void main(String[] args) {
		
		Calisan calisan = new Calisan();
		
		calisan.setIdLong(15L);
		calisan.setMaas(3000);
		
		System.out.println("Calışanın ID'si : "+ calisan.getIdLong());
		System.out.println("Maaş : "+ calisan.getMaas());
	}

}
