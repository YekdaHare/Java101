import java.util.Scanner;
public class main {    
    static void tekrarEdenSayılar(int arr[], int length) 
    {
        int x, y;
        System.out.println("TEKRAR EDEN SAYILAR: ");
        for (x = 0; x < length; x++) 
        {
            for (y = x + 1; y < length; y++) 
            {
                if (array[x] == array[y]) 
                    System.out.print(array[x] + " ");
            }
        }
    }
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int array[] = {4, 2, 4, 5, 2, 3, 1};
        int length = array.length;
        tekrarEdenSayılar(array, length);
    }
}
