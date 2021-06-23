import java.util.Scanner;
public class main {
    public static void main (String[]args){
       
       double m;
       int kg;
       
        Scanner input = new Scanner(System.in);
        System.out.println("LÜTFEN BOYUNUZU(METRE CİNSİNDEN) GİRİNİZ: ");
        m = input.nextDouble();
        
        System.out.println("LÜTFEN KİLONUZU GİRİNİZ: ");
        kg = input.nextInt();

        double VucutKitleIndeks = kg / (m * m); 

        System.out.println("VÜCUT KİTLE ENDEKSİNİZ: " + VucutKitleIndeks);
    }
}