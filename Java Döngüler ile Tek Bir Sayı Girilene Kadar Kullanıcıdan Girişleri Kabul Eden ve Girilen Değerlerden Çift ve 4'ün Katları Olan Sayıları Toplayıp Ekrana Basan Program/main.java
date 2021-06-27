import java.util.Scanner;
public class main {
    public static void main (String[]args) {
        //Scanner Sınıfı eklendi.
        Scanner input = new Scanner(System.in);
        
        //Kullanıcıdan veri alma ve tanımlamalar yapıldı.
        int toplam = 0;
        int sayi;

        //Do - While döngüsü tanımlandı.
        do {
          System.out.println("LÜTFEN BİR SAYI GİRİNİZ: ");
          sayi = input.nextInt();
          if (sayi % 2 ==0 && sayi % 4 ==0) {
              toplam += sayi;
          }
        } while (sayi % 2 ==0);
     

    }
}