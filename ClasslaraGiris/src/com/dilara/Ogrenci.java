package com.dilara;

public class Ogrenci {
	
	public int id;
	
	public String isimString;
	
	public String soyisimString;
	
	private String cinsiyetString; 
	
	//method overloading
	//parametre sayısı farklı olacak
	//parametre tipleri farklı olmalı 
	public Ogrenci() {
		
	}
	
	public Ogrenci(String p_cinsiyet) {
		cinsiyetString = p_cinsiyet;
	}
	
	public void cinsiyetYazdir() {
		System.out.println("Cinsiyet : " + this.cinsiyetString);
	}
	
	public Ogrenci(int id, String isim, String soyisim) {
		//this: şu an üzerinde çalıştığım class
		this.id=id;
		this.isimString = isim;
		this.soyisimString=soyisim;
	}
}
