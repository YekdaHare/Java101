import java.util.Scanner;
public class main {
    public static void main (String[]args) {
     
        //Scanner Tanımlandı.
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan veri alma.
        System.out.println("LÜTFEN BİR SAYI GİRİNİZ: ");
        int sayi = input.nextInt();

        // For döngüsü.
        for (int i=1; i<=sayi; i++) {
            System.out.println("4'ÜNCÜ KATI: " + Math.pow(i,4));
            System.out.println("5'İNCİ KATI: " + Math.pow(i,5));
            System.out.println("");
        }
    }
}