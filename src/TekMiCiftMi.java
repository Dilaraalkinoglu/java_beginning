import java.nio.channels.Pipe.SourceChannel;
import java.util.Iterator;
import java.util.Scanner;

public class TekMiCiftMi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("SAYININ TEK Mİ CİFT Mİ OLDUGUNU BULMA PROGRAMI");
		Scanner	 scanner = new Scanner(System.in);
		
		System.out.println("Dizinin eleman sayısını giriniz: ");
		int diziLength = scanner.nextInt();
		scanner.nextLine();
		
		int[] sayilar = new int[diziLength];
		
		for(int i =0; i<sayilar.length;i++) {
			System.out.println("Dizinin "+ i + ". index degerini giriniz: ");
			sayilar[i] = scanner.nextInt();
			scanner.nextLine();
		}
		
		for (int deger : sayilar) {
			tekMiCiftMi(deger);
		}
	}
	
	public static void tekMiCiftMi(int sayi) {
		if(sayi%2==0) {
			System.out.println("Sayi : "+ sayi + " CİFTTİR");
		
		}else {
			System.out.println("Sayi : " + sayi+ " TEKTİR");
		}
	}
}
