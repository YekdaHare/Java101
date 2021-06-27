import java.util.Scanner;
public class main {    
    public static void main(String[] args) {
        //Scanner Sınıfı eklendi.
        Scanner input = new Scanner(System.in);
        //Tanımlamalar yapıldı.
        int a, b;  
    //Kullanıcıdan girdi alma.
    System.out.println("LÜTFEN SÜTUN VE SATIR SAYISINI GİRİNİZ: ");  
    int line = input.nextInt();  
    int column = input.nextInt();  
    int array[][] = new int[line][column];  
    System.out.println("ŞÜTFEN SOLDAN SAĞA DOĞRU MATRİSİ YAZINIZ: ");  
    //for döngüleri.
    for(a = 0; a < line; a++)  
    {  
        for(b = 0; b < column; b++)   
            {  
            array[a][b] = input.nextInt();  
            System.out.print(" ");  
            }  
    }  
    System.out.println("SİZİN MATRİSİNİZ: ");  
    for(a = 0; a < line; a++)  
        {  
            for(b = 0; b < column; b++)  
            {  
            System.out.print(array[a][b]+" ");  
            }  
            System.out.println(" ");  
        }  
    System.out.println("TRANSPOZ MATRİSİNİZ: ");  
    for(a = 0; a < column; a++)  
        {  
            for(b = 0; b < line; b++)  
            {  
                System.out.print(array[b][a]+" ");  
            }  
            System.out.println(" ");  
        }  
    }
}
