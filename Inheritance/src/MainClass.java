import model.A;
import model.Hayvan;
import model.Kedi;
import model.Kopek;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Kalıtımın en güzel avantajı üst sınıflarda tanımlanan metot ve değişkenleri tekrar tekrar yazmaktan kurtarmasıdır
		
		
		// Önce en son miras alınan sınıfın constructor'ı cagrılır yani sıra ile C,B,A 'dır.
		
//		
//		A aNesnesi = new A(5,8);
//		System.out.println("B degisken1 : "+ aNesnesi.bDegisken1);
//		System.out.println("B degisken2 : "+ aNesnesi.bDegisken2);
////		aNesnesi.aSinifiMetotu();
//		
//	

		Hayvan hayvan = new Hayvan();
		hayvan.sesVer();
		
		Kopek kopek = new Kopek();
		kopek.sesVer();
		
		Kedi kedi = new Kedi();
		kedi.sesVer();
		
		
		
		
	}

}
