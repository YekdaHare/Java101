import java.util.Scanner;
public class main {
    //Üslu Sayı Fonksiyonu tanımlandı.
    static int usluSayı(int a, int b) {
        if (b>1) {
            a = a * usluSayı(a, b - 1);
        }
        return a;
    }
    public static void main (String[]args){
    //Scanner Sınıfı eklendi.
    Scanner input = new Scanner(System.in);
    System.out.println(usluSayı(5, 2));
    }
}