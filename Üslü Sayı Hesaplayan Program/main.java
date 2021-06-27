import java.util.Scanner;
public class main {
    public static void main (String[] args) {
		//Scanner Tanımı yapıldı. 
        Scanner input = new Scanner(System.in);
	    //Kullanıcıdan Değer alma.
        System.out.print("LÜTFEN ÜSLÜ SAYI İÇİN BİR TABAN DEĞERİ GİRİNİZ: ");
	    int sayınınTabanı = input.nextInt();
        int a = sayınınTabanı;
	    
	    
        System.out.print("LÜTFEN ÜSLÜ SAYI İÇİN BİR ÜS DEĞERİ GİRİNİZ: "); 
	    int sayınınUssu = input.nextInt();
	    // For döngüsü.
        for(int i=1; i<sayınınUssu; i++){
	        a = sayınınTabanı*a;
	        }
	    //Sonucun Ekrana Bastırılması.
        System.out.println("Sonuc: "+a);



	}


}