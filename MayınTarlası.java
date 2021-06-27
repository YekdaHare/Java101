import java.util.Scanner;
class field{
    private int [][]field = new int[10][10];
    private int line=0, column=0;
    field(){
        mayinBelirle(10);
    }
    field(int sayi){
        mayinBelirle(sayi);
    }
    void mayinBelirle(int sayi){
        for(int i=0; i<sayi; i++){
            line = (int) (Math.random()*10);
            column = (int) (Math.random()*10);
            if(field[line][column]==0){
                field[line][column]=1;
            }else{
                i--;
            }
        }
    }
    boolean control(int satir,int sutun){
        if(field[satir][sutun]==1){
            return true;
        }
        else{
            return false;
        }
    }
    void yazdirma(){
        for(int i=0; i<10; i++){
            for(int j=0;j<10;j++){
                System.out.print(field[i][j]);
            }
            System.out.println("");
        }
    }
}

public class main {    
    
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        field t = new field();
        int line, column, point = 0;
        boolean exit = false;
        t.yazdirma();  
        do{
            System.out.println("LÜTFEN SATIR GİRİNİZ: "); line=input.nextInt();
            System.out.println("LÜTFEN SÜTÜN GİRİNİZ:  "); column=input.nextInt();
            if(t.control(line, column)){
                exit=true;
            }else{
                exit=false;
                point++;
            }
            System.out.println("TAHMİN: "+line+"-"+column);
        }while(exit==false);
        System.out.print("PUANINIZ:" +point);
        
    }
}
