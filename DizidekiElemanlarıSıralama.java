import java.util.Scanner;
public class main {    
    public static void main(String[] args) {
        //Scanner sınıfı eklendi.
         Scanner input = new Scanner(System.in);
         int temporary;
         int piece;
         System.out.print("LÜTFEN GİRİLECEK SAYI ADEDİNİ BELİRTİNİZ: "); piece=input.nextInt();
         //array.
        int [] array = new int[10];
        //for döngüleri eklendi.
        for(int i = 0; i < piece; i++)
        {
            System.out.print("LÜTFEN DİZİNİZİN " + (i+1) + " . ELEMANINI GİRİNİZ: ");
            array[i] = input.nextInt();
        }
        System.out.println("DİZİNİZİN KÜÇÜKTEN BÜYÜĞE SIRALANMIŞ HALİ: ");
        for(int i = 0; i < piece-1; i++)
        {
            for(int j = i+1; j < piece; j++)
            {
                if(array[j] < array[i]) {
                    temporary = array[i];
                    array[i] = array[j];
                    array[j] = temporary;
                }
            }
        }
        for(int i = 0; i < piece; i++)
        {
            System.out.print("-" + array[i]);
        }
    }
}
