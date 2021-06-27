import java.util.Scanner;
public class main {    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("LÜTFEN BİR SAYI GİRİNİZ: ");
        int x = input.nextInt();
        
        for(int y=0; y<x; y++){
            for(int z=0; z<=y; z++){
                System.out.print(" ");
            }   
            for(int a=2*x-1;a>=(2*y+1);a--){
                System.out.print("*");
                
            }
                System.out.println();   
        }
    }
}
