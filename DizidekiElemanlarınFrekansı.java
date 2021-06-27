import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;
public class main {    
    public static void main(String[] args) {
        //Scanner Tanımlanması.
        Scanner input = new Scanner(System.in);
        int array[] = { 10, 20, 20, 10, 10, 20, 5, 20 };
        //List.
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> arrayListBackup = new ArrayList<>();
        List<Integer> sayiAdedi = new ArrayList<>();
        List<String> sayiAdediBackup = new ArrayList<>();
        //For döngüsü.
        for(int i = 0; i < dizi.length; i++) {
            arrayList.add(dizi[i]);
            arrayListBackup.add(dizi[i]);
        }
        arrayList = arrayList.stream().distinct().sorted().collect(Collectors.toList());
        arrayList.forEach(i->{
            System.out.print(i);
            sayiAdedi.add(0);
        });
        int index = 0;
        for(int i = 0; i < arrayList.size(); i++) {
            index = 0;
        for(int j = 0; j < arrayListBackup.size(); j++) {
                if(arrayListBackup.get(j) == arrayList.get(i)) {
                    index++;
                    
                }
            }
            sayiAdedi.set(i, index);
        }
        for(int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i) + "GİRDİĞİNİZ SAYININ ADEDİ: " + sayiAdedi.get(i));
        }
    }
}
