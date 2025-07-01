import java.util.Random;

public class TCKN {
	
	private Long idLong ;
	
	private String dogumYeriString;
	
	private String tcknString;

	public Long getIdLong() {
		return idLong;
	}

	public void setIdLong(Long idLong) {
		this.idLong = idLong;
	}

	public String getDogumYeriString() {
		return dogumYeriString;
	}

	public void setDogumYeriString(String dogumYeriString) {
		this.dogumYeriString = dogumYeriString;
	}

	public String getTcknString() {
		return tcknString;
	}
	
	boolean kontrol = true;

	public void setTcknString(String tcknString) {
		if(tcknString.length()==11) {
			for(int i = 0; i<tcknString.length();i++) {
				char karakter = tcknString.charAt(i);
				if(Character.isDigit(karakter)) {
					kontrol = true;
				}else {
					kontrol = false;
					break;
				}
			}
			if(kontrol) {
				Random random = new Random();
				this.tcknString = tcknString;
				// 0 ile 100 arası rastgele deger üretir
				int giseNo = random.nextInt(100);
				
				System.out.println("GİŞE NO : "+ giseNo);
			}else {
				sonucuYazdir("Lütfen bütün karakterleri rakam olacak şekilde giriniz!");
			}
		}else {
			sonucuYazdir("TC 11 karakter olmak zorundadır!");
		}
		
	}
	
	public void sonucuYazdir(String sonuc) {
		System.out.println(sonuc);
	}

		
}
