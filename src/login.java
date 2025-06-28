import java.util.Scanner;

public class login {

	static boolean aktif = true;
	static int hakSayisi = 3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Kullanıcının uygulamaya giriş yapmasını sağladık fakat kullanıcının kullanıcı adını ve şifresini
		// girmesi için yalnızca 3 hakkı vardır.Haklarını doldururs hesabını disable yapalım.
		//Doğru girer ise sisteme giriş yapsın 
		
		Scanner scanner = new Scanner(System.in);
		
		if(aktif) {
			if(hakSayisi>0) {
				while(aktif) {
					System.out.println("Kullanıcı adınız: ");
					String username = scanner.nextLine();
					
					System.out.println("Şifreniz: ");
					String password = scanner.nextLine();
					
					boolean sonuc = login(username, password);
					if(sonuc) {
						System.out.println("Uygulamaya başarılı olarak giriş yaptınız :)");
						break;
					}else {
						if(hakSayisi==0) {
							aktif=false;
							break;
						}
					}
				}
				if(aktif==false) {
					System.out.println("Hak sayınız dolmuştur.");
				}
			}else {
				System.out.println("Hak sayınız dolmuştur, hesabınız bloke oldu!");
			}
		}else {
			System.out.println("Hesabınız aktif değildir, yöneticiniz ile iletişime geciniz!");
		}

	}
	
	
	public static boolean login(String username, String password) {
		if(username.equals("dilara") && password.equals("123")) {
			
			return true; // başarılı
		}else {
			hakSayisi--;
			System.out.println("Kullanıcı adı veya şifreniz yanlıştır.");
			if(hakSayisi==0) {
				aktif= false;
			}
			return false;
		}
	}

}
