import java.util.Scanner;
public class main {
    public static void main (String[]args) {
    
     //Scanner Sınıfı tanımlandı.
     Scanner input = new Scanner(System.in);
     
     // Kullanıcıdan veri alma.
     System.out.println("LÜTFEN BİR SAYI GİRİNİZ: ");
     int sayi = input.nextInt();
     
     
    int uceBolunenSayi = 0, dordeBolunenSayi = 0, ucSayacı = 0, dortSayacı = 0;

    //for- if - else döngüsü tanımlanması.
    for (int i = 0; i<=sayi; i++ ) {
        if (i % 3 == 0) {
            uceBolunenSayi += i;
            ucSayacı++;
        }
        if (i % 4 == 0) {
            dordeBolunenSayi += i;
            dortSayacı++;
        }
    }
    // İşlem Tanımı.
    int ortalama = (uceBolunenSayi + dordeBolunenSayi) / (ucSayacı + dortSayacı);
    System.out.println("ORTALAMA:" + ortalama);
   
    }
}