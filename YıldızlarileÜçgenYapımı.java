import java.util.Scanner;
public class main {    
    public static void main(String[] args) {
        //Scanner Sınıfı Tanımlandı.
         Scanner input = new Scanner(System.in);
         //Kullanıcıdan veri alma.
         System.out.println("Bir Sayı Giriniz");
         int x = input.nextInt();
        //for döngüsü.
        for(int i=0; i<x; i++){
            for(int y=0; y<=i; y++){
                System.out.print(" ");
            }   
            for(int z=2 * x-1; z>=(2*i+1); z--) {
                System.out.print("*");           
            }
                System.out.println();   
        }
    }
}
