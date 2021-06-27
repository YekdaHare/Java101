import java.util.Scanner;
public class main {    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int counter = 0;
        System.out.print("LÜTFEN KELİME GİRİNİZ: ");
        String word = input.nextLine();
        String newWord = "";
        
        for(int i = (word.length()-1); i >= 0; i--)
        {
            newWord += word.charAt(i);
        }
        if(newWord.equals(word)) {
            System.out.println("KELİMENİZ PALİNDROMDUR.");
        }
        else {
            System.out.println("KELİMENİZ PALİNDROM DEĞİLDİR.");
        }  
    }
}
