
public class Ogrenci {
		
	private Long idLong;
	
	private String adString;
	
	private String soyString;
	
	public static String numaraString;
	
	public static void numaraYazdir() {
		System.out.println("Numara : "+numaraString);
	}

	public Long getIdLong() {
		return idLong;
	}

	public void setIdLong(Long idLong) {
		this.idLong = idLong;
	}

	public String getAdString() {
		return adString;
	}

	public void setAdString(String adString) {
		this.adString = adString;
	}

	public String getSoyString() {
		return soyString;
	}

	public void setSoyString(String soyString) {
		this.soyString = soyString;
	}
	
	
}
