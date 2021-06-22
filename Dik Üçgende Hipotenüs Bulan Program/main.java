import java.util.Scanner;
public class main {
    public static void main (String[]args) {
       //Değişkenleri oluşturma.
       int a,b,c;
       
       //Kullanıcıdan verileri alma.
       Scanner inp = new Scanner(System.in);
       System.out.println("İLK KENARIN DEĞERİNİ GİRİNİZ: ");
       a = inp.nextInt();
       
       System.out.println("İKİNCİ KENARIN DEĞERİNİ GİRİNİZ: ");
       b = inp.nextInt();
       
       System.out.println("ÜÇÜNCÜ KENARIN DEĞERİNİ GİRİNİZ: ");
       c = inp.nextInt();
       
       //Heron tanımı.
       int u = (a+b+c)/2;
       
       //Üçgenin çevresini hesaplama.
       int ucgenCevre = 2*u;
       System.out.println("ÜÇGENİN ÇEVRESİ: " + ucgenCevre);

       //Üçgenin alanını hesaplama.
       int ucgenAlan = u * (u-a) * (u-b) * (u-c);
       Math.sqrt(ucgenAlan);
       System.out.println("ÜÇGENİN ÇEVRESİ: " + ucgenAlan);
    }
}