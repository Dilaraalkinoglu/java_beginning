package model;

public class B extends C{
	
	public int bDegisken1;
	
	public int bDegisken2;
	
	public B(int bDegisken1) {
		this.bDegisken1 = bDegisken1; 
	}
	
	public B(int bDegisken1, int bDegisken2) {
		super();
		this.bDegisken1 = bDegisken1;
		this.bDegisken2 = bDegisken2;
	}

	public void bSinifiMetotu() {
		System.out.println("b sinif metotu");
	}
	
	public B() {
		System.out.println("B nesnesinin constructoru cagrılır...");
	}

}
