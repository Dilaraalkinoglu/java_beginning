package employee_example;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("*********Uygulamaya Hoşgeldiniz********");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("No değerini giriniz : ");
		int no = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("İsim değerini giriniz : ");
		String isim = scanner.nextLine();
		
		
		System.out.println("Soyisim değerini giriniz : ");
		String soyisim = scanner.nextLine();
		
		
		System.out.println("Tecrübe değerini giriniz : ");
		int tecrube = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Maaş değerini giriniz : ");
		double maas = scanner.nextInt();
		scanner.nextLine();
		
		Calisan calisan = new Calisan(no, isim, soyisim, tecrube, maas);
		
		String islemler = "1-Çalışan bilgilerini göster\n"
				+ "2-Zam yap\n" 
				+ "3-Format at";
		System.out.println("-----------------------------");
		
		System.out.println(islemler);
		
		System.out.print("Seçim yapınız : ");
		int secim = scanner.nextInt();
		scanner.nextLine();
		
		switch (secim) {
		case 1:
			calisan.calisanBilgileriGoster();
			break;
		case 2:
			System.out.println("Zam değerini giriniz : ");
			int zamDegeri = scanner.nextInt();
			scanner.nextLine();
			calisan.zamYap(zamDegeri);
			break;
		case 3:
			System.out.println("Kim format atacak ismini giriniz : ");
			String kisi = scanner.nextLine();
			System.out.println("İşlem sistemini yazınız :");
			String isletimSistemi = scanner.nextLine();
			calisan.formatAt(isletimSistemi, kisi);
			break;
		default:
			System.out.println("LÜTFEN BELİRTİLEN ARALIKTA DEĞER SEÇİMİ YAPINIZ!");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
