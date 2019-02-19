import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Delete_SubStr {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        ArrayList<String> ilya = new ArrayList<String>();

        System.out.print("\nВведите пять строк");
        for (int i = 0; i<5 ; i++){
            System.out.print("\nВведите " + (i+1) + "-ю строку:");
            ilya.add(i,input.nextLine());
        }

        System.out.print("\nВведите ключевую строку:");
        String key = input.nextLine();
        int keystr = 5;
        for (int i = 0; i<keystr; i++){
            if (Arrays.asList(ilya.get(i).toLowerCase().split(" ")).contains(key.toLowerCase())){
                ilya.remove(i);
                keystr--;
                i--;
            }
        }
        for (String i: ilya){
            System.out.print("\n" + i);
        }

    }
}
