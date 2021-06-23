import java.util.Scanner;
public class main {
    public static void main (String[]args) {
        
        int r, a;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("LÜTFEN YARIÇAP DEĞERİ GİRİNİZ: ");
        r = input.nextInt();
        
        System.out.println("LÜTFEN MERKEZ AÇI ÖLÇÜSÜ GİRİNİZ: ");
        a = input.nextInt();

        double alan = (pi * (r*r) * a) / 360;

        System.out.println("DAİRE DİLİMİNİN ALANI: ");

    }
}