import java.util.Scanner;
public class main {
    public static void main (String[]args){
        //Scanner Sınıfı Eklendi.
        Scanner input = new Scanner(System.in);

        System.out.println("LÜTFEN YAŞINIZI GİRİNİZ: ");
        int age = input.nextInt();
        
        //if - else if - else bloğu.
        if (age%12 == 0){
           System.out.println("MAYMUN");
        }

        else if (age%12 == 1) {
            System.out.println("HOROZ");
        }
        
        else if (age%12 == 2) {
            System.out.println("KÖPEK");
        }

        else if (age%12 == 3) {
            System.out.println("DOMUZ");
        }

        else if (age%12 == 4) {
            System.out.println("FARE");
        }

        else if (age%12 == 5) {
            System.out.println("ÖKÜZ");
        }

        else if (age%12 == 6) {
            System.out.println("KAPLAN");
        }

        else if (age%12 == 7) {
            System.out.println("TAVŞAN");
        }

        else if (age%12 == 8) {
            System.out.println("EJDERHA");
        }

        else if (age%12 == 9) {
            System.out.println("YILAN");
        }

        else if (age%12 == 10) {
            System.out.println("AT");
        }

        else if (age%12 == 11) {
            System.out.println("KOYUN");
        }

        else {
            System.out.println("LÜTFEN GEÇERLİ BİR DEĞER GİRİNİZ...");
        }
    }
}