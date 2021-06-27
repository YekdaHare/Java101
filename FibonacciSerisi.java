import java.util.Scanner;
public class main {    
    public static void main(String[] args) {
        //Scanner sınıfı eklendi.
         Scanner input = new Scanner(System.in);
         int a=0, b=1, c, x, y;
        //Girdi alma.
        System.out.print("N Sayısını Girin:");  
        y = input.nextInt();
        System.out.print(a+" "+b);
  
    for(x=2; x<=y; ++x){  
        c=a+b;  
        System.out.print(" "+c);  
        a=b;  
        b=c;  
    }
        System.out.println();
    }
}
