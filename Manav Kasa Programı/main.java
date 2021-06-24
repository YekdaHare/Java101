import java.util.Scanner;

import java.util.Scanner;
public class main {
    public static void main (String[]args){
    int perKg;
    
    double armut = 2.14;
    double elma = 3.67;
    double domates = 1.11;
    double muz = 0.95;
    double patlıcan = 5.00;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("ARMUT KAÇ KİLO? ");
    perKg = input.nextInt();
    double armutTotal = (armut * perKg);

    System.out.println("ELMA KAÇ KİLO? ");
    perKg = input.nextInt();
    double elmaTotal = (elma * perKg);

    System.out.println("DOMATES KAÇ KİLO? ");
    perKg = input.nextInt();
    double domatesTotal = (domates *perKg);

    System.out.println("MUZ KAÇ KİLO? ");
    perKg = input.nextInt();
    double muzTotal = (muz * perKg);

    System.out.println("PATLICAN KAÇ KİLO? ");
    perKg = input.nextInt();
    double patlıcanTotal = (patlıcan * perKg);

    double total = (armutTotal + elmaTotal + domatesTotal + muzTotal + patlıcanTotal);
    
    System.out.println("Toplam Tutar: " + total);

    }
}