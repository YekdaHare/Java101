  
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
	      //Scanner Sınıfı Eklendi.	
		  Scanner input = new Scanner(System.in);
	      //Kullanıcıdan Değer alma.  
          System.out.println("LÜTFEN n DEĞERİNİ GİRİNİZ: ");
	      int n = input.nextInt();
	        
	      System.out.println("LÜTFEN r DEĞERİNİ GİRİNİZ:  ");
	      int r = input.nextInt();
	     // if - else Döngüleri eklendi. 
	      if(n<r){
	            
	      System.out.println("n DEĞERİ, r DEĞERİNDEN KÜÇÜK OLAMAZ. LÜTFEN GİRDİĞİNİZ DEĞERLERİ KONTROL EDİNİZ...");
	      n=input.nextInt();

		  //Kombinasyon Fonksiyonu tanımlanması.
	      KombinasyonHesapla(n, r);
	     }
         else{
	            KombinasyonHesapla(n, r);
	        }           
	}
	
	 private static void KombinasyonHesapla(int n, int r) {
	        
            int faktoriyel1 = 1;
	        int faktoriyel2 = 1;
	        int faktoriyel3 = 1;
	        int farkDenklemi = n - r;
	        
	        for(int i=1;i<=n;i++){
	            
	            faktoriyel1 = faktoriyel1*i;
	        }
	        System.out.println("n SAYISININ FAKTORİYELİ : " + faktoriyel1);
	        
	        for(int j=1; j<=r; j++){
	            
	            faktoriyel2 = faktoriyel2 * j;
	        }
	        System.out.println("r SAYISININ FAKTORİYELİ : " + faktoriyel2);
	        
	        for(int k=1; k<=farkDenklemi; k++){
	            
	            faktoriyel3 =faktoriyel3 * k;
	        }
	        System.out.println("(n-r)'NİN FAKTORİYELİ : " + faktoriyel3);
	        
	        int faktoriyelCarpim = faktoriyel2 * faktoriyel3;
	        int kombinasyon = faktoriyel1 / faktoriyelCarpim;
	        
	        System.out.println(n + "SAYISININ" + r + "'Lİ" + "KOMBİNASYONU: " + kombinasyon);
	    }
}