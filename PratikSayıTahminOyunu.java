import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class JavaProject1 {    
    public static void main(String[] args) {
     
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

       
        while (right < 5) {
            System.out.print("LÜTFEN TAHMİNİNİZİ GİRİNİZ: ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("LÜTFEN 0 İLE 100 ARASINDA BİR DEĞER GİRİNİZ: ");
                if (isWrong) {
                    right++;
                    System.out.println("ÇOK HATALI DENEME YAPTINIZ. KALAN HAKKINIZ:" + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("BİR DAHA HATALI GİRİŞİNİZDE SİSTEM BİTECEKTİR.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("TEBRİKLER! SAYINIZ: " + number);
                isWin = true;
                break;
            } else {
                System.out.println("LÜTFEN DOĞRU BİR SAYI GİRİNİZ...");
                if (selected > number) {
                    System.out.println(selected + "SAYISI GİZLİ SAYIDAN BÜYÜKTÜR.");
                } else {
                    System.out.println(selected + " SAYISI GİZLİ SAYIDAN KÜÇÜKTÜR.");
                }

                wrong[right++] = selected;
                System.out.println("KALAN HAKKINIZ: " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("KAYBETTİNİZ... ");
            if (!isWrong) {
                System.out.println("YAPTIĞINIZ TAHMİNLER: " + Arrays.toString(wrong));
            }
        }
    }
}
