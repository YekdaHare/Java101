import java.util.Scanner;
public class main {
    public static void main(String[] args) {
		//Scannner Sınıfı eklendi. 
        Scanner input = new Scanner(System.in);
        //Kullanıcıdan Değer alma.
	        System.out.print("LÜTFEN BİR SAYI GİRİNİZ: ");
	        int sayı = input.nextInt();
	        int bosluk = sayı;
	        metotDeseni(sayı,bosluk,false);
	}

	   public static void metotDeseni (int sayı, int bosluk, boolean durum) {
            // if - else yapısı.
	        if (sayı <= bosluk) {
	        System.out.println(sayı);
	        if (sayı > 0 && !durum) {
	            metotDeseni(sayı-5, bosluk, false);
	        }else{
	            metotDeseni(sayı+5, bosluk, true);
	            }
	        }
	    }
}
