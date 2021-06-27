import java.util.Scanner;
public class main {    
    public static void main(String[] args) {
        //Scanner Sınıfı.
         Scanner input = new Scanner(System.in);
         int toplam = 0;
        //Girdi alma.
        System.out.print("LÜTFEN BİR SAYI GİRİNİZ: ");
        int sayi = input.nextInt();
        
        for(int i = 1; i < sayi; i++) {
            if(sayi % i == 0) {
                toplam += i;
            }
        }
        if(sayi == toplam) {
            System.out.println(sayi + " BU SAYI BİR MÜKEMMEL SAYIDIR.");
        }
        else {
            System.out.println(sayi + " BU SAYI BİR MÜKEMMEL SAYI DEĞİLDİR.");
        }
    }
}
