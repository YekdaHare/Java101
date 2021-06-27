import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Scanner Sınıfı Tanımlandı.
        Scanner input = new Scanner(System.in);
        System.out.print("LÜTFEN BİR SAYI GİRİNİZ: ");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;
        
        //While Döngüsü.
        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
         //For Döngüsü.  
            basPow = 1;
            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }
        //if - else döngüsü.
        if (result == number) {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
        }

        int a = 2451, basamakSayisi = 0, numberCounter = 0;
        while (a != 0) {
            a /= 10;
            numberCounter++;
        }
        int b = 2451;
        int c = b % 10;
        int sub = 2, sup = 3;
        int result = 1;
        for (int i = 1; i <= sup; i++ ){
            result *= sub;
        }
        System.out.println(result);
    }
}
