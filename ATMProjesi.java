import java.util.Scanner;
public class main {    
    public static void main(String[] args) {
        //Scanner Sınıfı Tanımlanması. 
        Scanner input = new Scanner(System.in);
         int balance = 1000;
        //Tanımlamalar.
        System.out.println("BAKİYENİZ: " + balance);
        System.out.println("****İŞLEMLER****");
        System.out.println("1. İŞLEM: PARA ÇEKME");
        System.out.println("2. İŞLEM: PARA YATIRMA");
        System.out.println("3. İŞLEM: BAKİYE SORGULAMA");
        System.out.println("4. İŞLEM: KART İADE");
        //Kullanıcıdan Girdi Alınması.
        System.out.println(" LÜTFEN İŞLEM SEÇİNİZ: ");
        int islem = input.nextInt();
        // Switch - case yapısı.
        switch(islem) {
        case 1:
            System.out.println("BAKİYENİZ: " + balance);
            System.out.print("LÜTFEN ÇEKMEK İSTEDİĞİNİZ TUTARI GİRİNİZ: ");
            int amount = input.nextInt();
            if(amount > balance) {
                System.out.print("YETERSİZ BAKİYE. LÜTFEN TEKRAR GİRİNİZ.");
                amount = input.nextInt();
            }
            balance -= amount;
            System.out.println("YENİ BAKİYENİZ: " + balance);
            break;
        case 2:
            System.out.println("BAKİYENİZ: " + balance);
            System.out.print("LÜTFEN YATIRMAK İSTEDİĞİNİZ TUTARI GİRİNİZ: ");
            amount = input.nextInt();
            balance += amount;
            System.out.println("YENİ BAKİYENİZ: " + balance);
            break;
        case 3:
            System.out.println("BAKİYENİZ: " + balance);
            break;
        case 4:
            System.out.println("LÜTFEN KARTINIZI ALMAYI UNUTMAYINIZ!");
        default:
            System.out.println("GEÇERSİZ BİR İŞLEM SEÇTİNİZ. LÜTFEN GEÇERLİ BİR İŞLEM SEÇİNİZ...");
        }
    }
}
