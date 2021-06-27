import java.util.Scanner;
public class main {    
    static float harmonikDizi(float array[], int x)
    {
        float toplam = 0;
        for (int a = 0; a < x; a++)
            toplam = toplam + (float)1 / arr[a];
      
        return (float)x/toplam;
    }
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         float array[]= { 17.5f, 23.3f, 32.2f};
        int x = array.length;
        System.out.println("HARMONİK DİZİ SONUCU: "+ harmonikDizi(array, x));
    }
}
