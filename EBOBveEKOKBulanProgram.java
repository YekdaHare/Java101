import java.util.Scanner;
public class main {    
    public static void main(String[] args) {
        // Scanner Sınıfı Tanımlandı.
         Scanner input = new Scanner(System.in);
         System.out.print("LÜTFEN GEÇERLİ x VE y DEĞERLERİ GİRİNİZ: ");
         int x = input.nextInt();
         int y = input.nextInt();
         int ekok = 1;
         int ebob = 1;
 
        ekok= (x > y) ? x : y;
        // While Döngüsü.
        while(true)
        {
            if( ekok % x == 0 && ekok % y == 0 )
            {
                System.out.printf("SAYILARIN EKOK'LARI: ", x, y, ekok);
                break;
            }
            ++ekok;
        }
        
        while(x != y)
        {
            if(x > y)
                x -= y;
            else
                y -= x;
        }
        System.out.println("SAYILARIN EBOB'LARI: " + x);
    }
}
