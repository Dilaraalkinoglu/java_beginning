
public class metotKullanimi {
		public static void main(String[] args) {
			
			//topla(10,26);
			int carpmadanGelenSonuc=carp(4, 8);
			System.out.println("Sonuc: " + carpmadanGelenSonuc);
		}
		
		public static void topla(int sayi1, int sayi2) {
			int sonuc = sayi1 + sayi2;
			System.out.println("Sonuc : " + sonuc);
		}
		public static int carp(int sayi1, int sayi2) {
			int sonuc = sayi1 * sayi2;
			return sonuc;
		}
}
		
		
