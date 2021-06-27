import java.util.Scanner;
public class main {    
        public static void main(String[] args) {
        // Scanner Sınıfı tanımlandı.
         Scanner input = new Scanner(System.in);
         System.out.println("LÜTFEN SAYI ADEDİNİ YAZINIZ: "); 
         int step = input.nextInt(); 
        int max=0, min=0;
        // For döngüsü.
        for (int i=1; i<=step; i++) {
            System.out.println(i +". LÜTFEN SAYIYI GİRİNİZ: ");
            int number = input.nextInt();
           // if yapısı. 
            if (i==1) {
                max=number;
                min=number;
            }
            
            if (number>max)
                max=number;
            
            if (number<min)
                min=number;
        }
        
        System.out.println("MAKSİMUM DEĞER: "+ max);
        System.out.println("MİNİMUM DEĞER: "+ min);
    }
}
