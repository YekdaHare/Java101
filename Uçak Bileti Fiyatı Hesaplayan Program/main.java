import java.util.Scanner;
public class main {    
    public static void main(String[] args) {
        //Scanner Tanımlanması.
        Scanner input = new Scanner(System.in);
        //Kullanıcıdan Veri Alma.
        System.out.print("LÜTFEN MESAFE GİRİNİZ: "); 
        int km = input.nextInt();
        
        System.out.print("LÜTFEN YAŞINIZI GİRİNİZ: "); 
        int age = input.nextInt();
        
        System.out.print("LÜTFEN YOLCULUK TİPİ SEÇİNİZ : (1-TEK YÖNLÜ UÇUŞ || 2-GİDİŞ DÖNÜŞ UÇUŞ)"); 
        int choose = input.nextInt();
        // If else yapısı.
        if (km > 0 && age > 0 && choose==1 || choose==2){
            int baslangıcFıyat = (int) (km * 0.10);
            System.out.println("NORMAL FİYAT: "+ baslangıcFıyat);
            
            if ( age < 12 && choose==1 ){
                int indirimliFiyat = (int) (baslangıcFıyat * 0.50);
                baslangıcFıyat -= indirimliFiyat;
                System.out.println("İNDİRİMLİ FİYAT: "+ baslangıcFıyat);
            }
            
            else if ( age >= 12 || age <= 24 && choose==1 ){
                int indirimliFiyat = (int) (baslangıcFıyat * 0.10);
                baslangıcFıyat -= indirimliFiyat;
                System.out.println("İNDİRİMLİ FİYAT: "+ baslangıcFıyat);
            }
            
            else if ( age >= 65 && choose==1 ){
                int indirimliFiyat = (int) (baslangıcFıyat * 0.30);
                baslangıcFıyat -= indirimliFiyat;
                System.out.println("İNDİRİMLİ FİYAT: "+ baslangıcFıyat);
            }
           
            else if ( age < 12 && choose==2 ){
                int indirimli = (int) (baslangıcFıyat * 0.50);
                int indirimliTutar = baslangıcFıyat - indirimli;
                int donusIndirim = (int) (indirimliTutar * .20);
                baslangıcFıyat = (indirimliTutar-donusIndirim) * 2;
                System.out.println("İNDİRİMLİ FİYAT: "+ baslangıcFıyat);
            }
            
            else if ( age >= 12 || age <= 24 && choose==2 ){
                int indirimliFiyat = (int) (baslangıcFıyat *  0.10);
                int indirimliTutar = baslangıcFıyat - indirimliFiyat;
                int donusIndirim = (int) (indirimliTutar * 0.20);
                baslangıcFıyat = (indirimliTutar-donusIndirim) * 2;
                System.out.println("İNDİRİMLİ FİYAT: "+ baslangıcFıyat);
            }
           
            else if ( age >=65 && choose==2 ){
                int indirimli = (int) (baslangıcFıyat * 0.30);
                int indirimliTutar = baslangıcFıyat - indirimli;
                int donusIndirim = (int) (indirimliTutar * 0.20);
                baslangıcFıyat = (indirimliTutar-donusIndirim) * 2;
                System.out.println("İNDİRİMLİ FİYAT: "+ baslangıcFıyat);
            }
        }else{
            System.out.println("LÜTFEN GEÇERLİ BİR İŞLEM GERÇEKLEŞTİRİNİZ...");
        }
    }
}