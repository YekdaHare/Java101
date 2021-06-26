import java.util.Scanner;
public class main {    
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("BUGÜN İÇİN HAVA SICAKLIĞINI GİRİNİZ: ");
       int havaSıcaklıgı = input.nextInt();
        if ( havaSıcaklıgı<=5 ){
            System.out.println("KARTOPU OYNAYABİLİRSİNİZ!");
        }else if ( havaSıcaklıgı>10 || havaSıcaklıgı<=25 ){
            System.out.println("DIŞARI ÇIKIP BASKETBOL VEYA FUTBOL OYNAYABİLİRSİNİZ.");
        }else if ( havaSıcaklıgı>20 || havaSıcaklıgı<=30 ){
            System.out.println("PİKNİK YAPMAK İÇİN MUHTEŞEM BİR HAVA!");
        }else if ( havaSıcaklıgı>30 ){
            System.out.println("DIŞARIDA DENİZE GİRMEK İÇİN HARİKA BİR HAVA VAR!");
        }
    }
}