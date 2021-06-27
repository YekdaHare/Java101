import java.util.Scanner;
public class main {    
    // Sayının Asal Olup Olmadığının Sorgulandığı Döngünün eklenmesi. 
    static boolean sayıAsalMı(int a, int b){ 
        if (a <= 2)
            return (a == 2) ? true : false;
        if (a % b == 0)
            return false;
        if (b * b > a)
            return true;
        return sayıAsalMı(a, b + 1);
    }
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         //Kullanıcıdan Değer Alma.
         System.out.print("LÜTFEN SAYI GİRİNİZ: "); 
         int n = input.nextInt();
         //if - else döngüsü.
         if(sayıAsalMı(n, 2))
             System.out.println("GİRDİĞİNİZ SAYI ASAL");
         else
             System.out.println("GİRDİĞİNİZ SAYI ASAL DEĞİL");
    }
}