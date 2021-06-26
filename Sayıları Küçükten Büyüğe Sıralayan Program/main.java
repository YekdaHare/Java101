import java.util.Scanner;
public class main {    
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("LÜTFEN 1. SAYIYI GİRİNİZ: ");   
        int sayi1 = input.nextInt();
        
        System.out.println("LÜTFEN 2. SAYIYI GİRİNİZ: ");   
        int sayi2 = input.nextInt();
        
        System.out.println("LÜTFEN 3. SAYIYI GİRİNİZ: ");   
        int sayi3 = input.nextInt();
       
        if( sayi1>sayi2 && sayi1>sayi3 && sayi2>sayi3 ){
           System.out.println("SAYILARIN KÜÇÜKTEN BÜYÜĞE SIRALANIŞI: "+sayi3 +sayi2 +sayi1);
       }
       else if( sayi1>sayi2 && sayi1>sayi3 && sayi3>sayi2 ){
           System.out.println("SAYILARIN KÜÇÜKTEN BÜYÜĞE SIRALANIŞI: "+sayi2 +sayi3 +sayi1);
       }
       else if( sayi2>sayi1 && sayi2>sayi3 && sayi1>sayi3 ){
           System.out.println("SAYILARIN KÜÇÜKTEN BÜYÜĞE SIRALANIŞI: " +sayi3 +sayi1 +sayi2);
       }
       else if( sayi2>sayi1 && sayi2>sayi3 && sayi3>sayi1 ){
           System.out.println("SAYILARIN KÜÇÜKTEN BÜYÜĞE SIRALANIŞI: "+sayi1 +sayi3 +sayi2);
       }
       else if( sayi3>sayi1 && sayi3>sayi2 && sayi1>sayi2 ){
           System.out.println("SAYILARIN KÜÇÜKTEN BÜYÜĞE SIRALANIŞI: "+sayi2 +sayi1 +sayi3);
       }
       else if( sayi3>sayi1 && sayi3>sayi2 && sayi2>sayi1 ){
           System.out.println("SAYILARIN KÜÇÜKTEN BÜYÜĞE SIRALANIŞI: "+sayi1 +sayi2 +sayi3);
       }
    }
}