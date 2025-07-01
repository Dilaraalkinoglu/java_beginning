import java.util.Random;
import java.util.Scanner;

public class AnaSinif {

	public static void main(String[] args) {
		
		//Gişe Uygulaması : TC doğru ise numara versin yanlış ise uyarsın
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Gişe Uygulamasına Hoşgeldiniz!");
		System.out.println("Lütfen TCK giriniz : ");
		
		String tcknString = scanner.nextLine();
		
		TCKN tcknNesne = new TCKN();
		tcknNesne.setTcknString(tcknString);
		
		
	}

}
