import java.util.Scanner;
public class main {    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float matOrt = 0, turkceOrt=0, fizikOrt=0, kimyaOrt=0;
        int sayi;
        System.out.println("LÜTFEN MATEMATİK NOTLARINIZI GİRİNİZ: ");
        System.out.print("1.NOT: ");  int mat1 = input.nextInt();
        System.out.print("2.NOT: ");  int mat2 = input.nextInt();
        System.out.print("3.NOT: ");  int mat3 = input.nextInt();
        if(mat1>0 && mat1<100 && mat2>0 && mat2<100 && mat3>0 && mat3<100){
            matOrt = (mat1+mat2+mat3) / 3;
        }
        
        System.out.println("LÜTFEN FİZİK NOTLARINIZI GİRİNİZ: ");
        System.out.print("1.NOT: ");  int fizik1 = input.nextInt();
        System.out.print("2.NOT: ");  int fizik2 = input.nextInt();
        System.out.print("3.NOT: ");  int fizik3 = input.nextInt();
        if(fizik1>0 && fizik1<100 && fizik2>0 && fizik2<100 && fizik3>0 && fizik3<100){
            fizikOrt = (fizik1+fizik2+fizik3) / 3;
        }
        
        System.out.println("LÜTFEN TÜRKÇE NOTLARINIZI GİRİNİZ: ");
        System.out.print("1.NOT: ");  int türkce1 = input.nextInt();
        System.out.print("2.NOT: ");  int türkce2 = input.nextInt();
        System.out.print("3.NOT: ");  int turkce3 = input.nextInt();
        if(türkce1>0 && türkce1<100 && türkce2>0 && türkce2<100 && turkce3>0 && turkce3<100){
            turkceOrt = (türkce1+türkce2+turkce3) / 3;
        }
        
        System.out.println("LÜTFEN KİMYA NOTLARINIZI GİRİNİZ: ");
        System.out.print("1.NOT: ");  int kimya1 = input.nextInt();
        System.out.print("2.NOT: ");  int kimya2 = input.nextInt();
        System.out.print("3.NOT: ");  int kimya3 = input.nextInt();
        if(kimya1>0 && kimya1<100 && kimya2>0 && kimya2<100 && kimya3>0 && kimya3<100){
            kimyaOrt = (kimya1+kimya2+kimya3) /3 ;
        }
        float genelOrt = (fizikOrt+kimyaOrt+matOrt+turkceOrt) / 4;
        if (genelOrt>55) {
            System.out.println("TEBRİKLER! SINIFI GEÇTİNİZ. ORTALAMANIZ: "+genelOrt);
        }else{
            System.out.println("MAALESEF! SINIFI GEÇEMEDİNİZ. ORTALAMANIZ: "+genelOrt);
        }
    }   
}