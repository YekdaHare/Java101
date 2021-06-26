import java.util.Scanner;
public class main {    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kullanıcıAdı = "yekda";
        int sıfre = 98765;
        System.out.print("LÜTFEN KULLANICI ADINIZI GİRİNİZ: ");
        String isim = input.nextLine();
        System.out.print("LÜTFEN ŞİFRENİZİ GİRİNİZ: ");
        int girilenSifre = input.nextInt();
        if(isim.equals(kullanıcıAdı) && girilenSifre == sıfre){
            System.out.println("SİSTEME HOŞGELDİNİZ");
        }else{
            System.out.println("GİRİŞ BAŞARISIZ");
            System.out.print("ŞİFRENİZİ Mİ UNUTTUNUZ? ŞİFREMİ SIFIRLA");
            int deger = input.nextInt();
            switch(deger){
                case 1:
                    System.out.print("LÜTFEN YENİ ŞİFRENİZİ GİRİNİZ: ");
                    int yeniSifre = input.nextInt();
                    if(yeniSifre == sıfre || yeniSifre == girilenSifre){
                        System.out.println("YENİ ŞİFRE ESKİ ŞİFRE İLE AYNI OLAMAZ. LÜTFEN BAŞKA BİR DEĞER GİRİN");
                    }else{
                        System.out.println("YENİ ŞİFRENİZ OLUŞTURULDU!");
                        sıfre = yeniSifre;
                    }
                    break;
                case 2:
                    System.out.println("İŞLEM İPTAL EDİLDİ...");
                    break;
                default:
                    System.out.println("LÜTFEN GEÇERLİ BİR İŞLEM SEÇİNİZ...");
            }
        }
    }   
}