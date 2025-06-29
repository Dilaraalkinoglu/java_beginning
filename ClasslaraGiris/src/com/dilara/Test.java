package com.dilara;
import com.dilara.Ogrenci;

public class Test {
	public static void main(String[] args) {
		
		Ogrenci ogrenci1 = new Ogrenci("Kadın");
		
		ogrenci1.id = 5;
		ogrenci1.isimString ="Dilara";
		ogrenci1.soyisimString="Su";
		
		System.out.println("Ogrenci bilgileri");
		System.out.println("ID : "+ ogrenci1.id);
		System.out.println("İsim : "+ ogrenci1.isimString);
		System.out.println("Soyisim : "+ ogrenci1.soyisimString);
		ogrenci1.cinsiyetYazdir();
		
	}
}
