import java.util.Scanner;
public class main {    
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        //Girdi alma.
        System.out.print("İLK SAYIYI GİRİNİZ: ");
        a = input.nextInt();
        System.out.print("İKİNCİ SAYIYI GİRİNİZ: ");
        b = input.nextInt();
        System.out.print("LÜTFEN BİR İŞLEM SEÇİNİZ.");
        System.out.println("\n1-TOPLAMA\n2-ÇIKARMA\n3-ÇARPMA\n4-BÖLME");
        int c = input.nextInt();
        //Switch-Case yapısı.
        switch(c){
            case 1:
                System.out.print("TOPLAMA İŞLEMİ SEÇTİNİZ: "+ (a+b));
                break;
            case 2:
                System.out.print("ÇIKARMA İŞLEMİ SEÇTİNİZ: "+ (a-b));
                break;
            case 3:
                System.out.print("ÇARPMA İŞLEMİ SEÇTİNİZ: "+ (a*b));
                break;
            case 4: 
                System.out.println("BÖLME İŞLEMİ SEÇTİNİZ: "+ (a/b));
                break;
            default:
                System.out.println("LÜTFEN GEÇERLİ BİR DEĞER GİRİNİZ...");
        }
    }
    
}
