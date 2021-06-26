import java.util.Scanner;
public class main {    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String ocak = "Ocak", subat = "Şubat", mart = "Mart", nisan = "Nisan", mayıs = "Mayıs", haziran= "Haziran",
        temmuz= "Temmuz", agustos= "Ağustos", eylul= "Eylül", ekim= "Ekim", kasım= "Kasım", aralık ="Aralık";
        
        System.out.print("LÜTFEN DOĞDUĞUNUZ AYI YAZINIZ: ");
        String month = input.nextLine();
        
        System.out.print("LÜTFEN DOĞDUĞUNUZ GÜNÜ GİRİNİZ: ");
        int day = input.nextInt();
        
        if(ocak.equals(month)){
            if( day>=22 ){
                System.out.println("KOVA BURCUSUNUZ");
            }
            else{
                System.out.println("OĞLAK BURCUSUNUZ");
            }
        }else if(subat.equals(month)){
            if( day>=20 ){
                System.out.println("BALIK BURCUSUNUZ");
            }
            else{
                System.out.println("KOVA BURCUSUNUZ");
            }
        }else if(mart.equals(month)){
            if( day>=21 ){
                System.out.println("KOÇ BURCUSUNUZ");
            }
            else{
                System.out.println("BALIK BURCUSUNUZ");
            }
        }else if(nisan.equals(month)){
            if( day>=21 ){
                System.out.println("BOĞA BURCUSUNUZ");
            }else{
                System.out.println("KOÇ BURCUSUNUZ");
            }
        }else if(mayıs.equals(month)){
            if( day>=22 ){
                System.out.println("İKİZLER BURCUSUNUZ");
            }
            else{
                System.out.println("BOĞA BURCUSUNUZ");
            }
        }else if(haziran.equals(month)){
            if( day>=23 ){
                System.out.println("YENGEÇ BURCUSUNUZ");
            }
            else{
                System.out.println("İKİZLER BURCUSUNUZ");
            }
        }else if(temmuz.equals(month)){
            if( day>=23 ){
                System.out.println("ASLAN BURCUSUNUZ");
            }
            else{
                System.out.println("YENGEÇ BURCUSUNUZ");
            }
        }else if(agustos.equals(month)){
            if( day>=23 ){
                System.out.println("BAŞAK BURCUSUNUZ");
            }
            else{
                System.out.println("ASLAN BURCUSUNUZ");
            }
        }else if(eylul.equals(month)){
            if( day>=23 ){
                System.out.println("TERAZİ BURCUSUNUZ");
            }
            else{
                System.out.println("BAŞAK BURCUSUNUZ");
            }
        }else if(ekim.equals(month)){
            if( day>=23 ){
                System.out.println("AKREP BURCUSUNUZ");
            }
            else{
                System.out.println("TERAZİ BURCUSUNUZ");
            }
        }else if(kasım.equals(month)){
            if( day>=22 ){
                System.out.println("YAY BURCUSUNUZ");
            }else{
                System.out.println("AKREP BURCUSUNUZ");
            }
        }else if(aralık.equals(month)){
            if( day>=22 ){
                System.out.println("OĞLAK BURCUSUNUZ");
            }
            else{
                System.out.println("YAY BURCUSUNUZ");
            }
        }
        else{
            System.out.println("LÜTFEN GEÇERLİ BİR DEĞER GİRİNİZ...");
        }
    }
}