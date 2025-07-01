package com.dilaraalk.model;

public class Calisan {
	
	
	
	private Long idLong;
	
	private String isimString;
	
	private String soyiString;
	
	private int maas;
	
	public Calisan() {
		
	}
	
	public Calisan(Long idLong, String isimString, String soyiString, int maas) {
		this.idLong = idLong;
		this.isimString = isimString;
		this.soyiString = soyiString;
		this.maas = maas;
	}



	public Long getIdLong() {
		return idLong;
	}



	public void setIdLong(Long idLong) {
		this.idLong = idLong;
	}

	public String getIsimString() {
		return isimString;
	}

	public void setIsimString(String isimString) {
		this.isimString = isimString;
	}

	public String getSoyiString() {
		return soyiString;
	}

	public void setSoyiString(String soyiString) {
		this.soyiString = soyiString;
	}

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		if(maas>=1000 && maas<=5000) {
			this.maas = maas;
		}
		
	}
	
	
	
	
	
}
