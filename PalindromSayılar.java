import java.util.Scanner;
public class main {    
    public static void find(){
        Scanner input = new Scanner(System.in);
        System.out.println("LÜTFEN BİR SAYI GİRİNİZ: ");
        int palindrom = input.nextInt();
        int firstVar = palindrom;        
        int length = String.valueOf(palindrom).length();
         
        int rest,value=0;
        for (int i = 0; i<length; i++){
             
            rest = palindrom % 10;
            value = value * 10 + rest;
            palindrom = palindrom /10;
        }
         
        if(value == firstVar){
            System.out.println(value + " BİR PALİNDROM SAYIDIR.");
        }else{
            System.out.println(value + " BİR PALİNDROM SAYI DEĞİLDİR.");
        }
    }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         find();
    }
}
