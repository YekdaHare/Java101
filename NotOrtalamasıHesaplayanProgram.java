import java.util.Scanner;
public class NotOrtalamasıHesaplayanProgram {
    public static void main(String[]args) {
        //değişkenler oluşturuldu
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner sınıfı tanımlandı
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değer alma 
        System.out.println("MATEMATİK NOTUNUZU GİRİNİZ:");
        mat = inp.nextInt();

        System.out.println("FİZİK NOTUNUZU GİRİNİZ:");
        fizik = inp.nextInt();

        System.out.println("KİMYA NOTUNUZU GİRİNİZ:");
        kimya = inp.nextInt();

        System.out.println("TÜRKÇE NOTUNUZU GİRİNİZ:");
        turkce = inp.nextInt();

        System.out.println("TARİH NOTUNUZU GİRİNİZ:");
        tarih = inp.nextInt();

        System.out.println("MÜZİK NOTUNUZU GİRİNİZ:");
        muzik = inp.nextInt();
        //Not ortalaması
        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;
        System.out.println("ORTALAMANIZ:" + sonuc);
        //Sınıfta kalma ve geçme durumu tanımlanması
        if (sonuc>=60) {
           System.out.println("SINIFI GEÇTİ");
        }
        else {
            System.out.println("SINIFTA KALDI");
        }
    }
}