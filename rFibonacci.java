import java.util.Scanner;
public class main {    
 
    static int fibonacci(int x){
    if (x <= 1)
       return x;
    return fibonacci(x-1) + fibonacci(x-2);
    }
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("LÜTFEN BİR SAYI GİRİNİZ: "); 
         int sayi = input.nextInt();
         System.out.println(fibonacci(sayi));
    }
}
