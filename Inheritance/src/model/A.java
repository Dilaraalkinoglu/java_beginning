package model;

public class A extends B{
	
	public int aDegisken1;
	
	public int aDegisken2;
	
	//super() 1-kodların en üstte olmalı 2- yapıcı metot içinde kullanılmalı
	
	
	public A(int aDegisken1, int aDegisken2) {
		super(aDegisken1,aDegisken2); //miras aldıgınız üst classın yapıcı metotuna erişmek için kullanıyoruz.
//		this.aDegisken1 = aDegisken1; // this.aDegisken1 , A sınıfının içindeki değerdir.
//		this.aDegisken2 = aDegisken2;
	}
	
//	public void aSinifiMetotu() {
//		System.out.println("a sinifnin metotu");
//		super.bSinifiMetotu(); //super , miras aldıgımız classın icindekini temsil ediyor.
//	}
	
	public void aSinifiMetotu() {
		System.out.println("A sinifi metotu");
		
	}


	public A() {
		System.out.println("A nesnesinin constructoru cagrılır...");
	}
	
	

}
