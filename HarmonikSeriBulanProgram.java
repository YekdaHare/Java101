import java.util.Scanner;
public class main {    
    
    static float harmonikSeri (float arr[], int a){
        float toplam = 0;
        for (int i = 0; i < a; i++)
            toplam = toplam + (float)1 / arr[i];
        return (float)a / toplam;
    }
    
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         float arr[]= { 17.5f, 23.3f, 32.2f};
        int a = arr.length;
        System.out.println("HARMONİK DİZİ SONUCU:  "+ harmonikSeri(arr, a));
    }
}
