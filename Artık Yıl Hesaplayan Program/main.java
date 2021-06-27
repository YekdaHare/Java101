import java.util.Scanner;
public class main {
    public static void main (String[]args) {
        //Scanner Sınıfı Tanımlandı.
        Scanner input = new Scanner(System.in);
        
        //Kullanıcıdan değer alma.
        System.out.println("LÜTFEN BİR YIL DEĞERİ GİRİNİZ: ");
        int year = input.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))  {
        System.out.println(year + "ARTIK BİR YILDIR.");
        }
        else {
        System.out.println(year + "ARTIK BİR YIL DEĞİLDİR.");
        }


    }
}