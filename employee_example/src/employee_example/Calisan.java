package employee_example;

public class Calisan {
	
		public int no;
		
		public String isimString;
		
		public String soyiString;
		
		public int tecrube;
		
		public double maas;
		
		public Calisan() {
			// TODO Auto-generated constructor stub
		}
		
		
		
		public Calisan(int no, String isimString, String soyiString, int tecrube, double maas) {
			super();
			this.no = no;
			this.isimString = isimString;
			this.soyiString = soyiString;
			this.tecrube = tecrube;
			this.maas = maas;
		}


		public void calisanBilgileriGoster() {
			System.out.println("*******ÇALIŞAN BİLGİLERİ********");
			System.out.println("NO : " + no);
			System.out.println("İsim : "+ isimString);
			System.out.println("Soyisim : "+ soyiString);
			System.out.println("Tecrübe : "+ tecrube);
		}
	
		
		public void zamYap(int zamDegeri) {
			System.out.println("Maaşınıza "+ zamDegeri + " TL zam yapıldı");
			System.out.println("Şuanki güncel maaşınız : "+ (maas+zamDegeri));
		}
		
		public void formatAt(String isletimSistemi, String kim) {
			System.out.println(kim+" şuanda "+isletimSistemi+ " işletim sistemine format atıyor.");
		}
		
		
		
		
}
