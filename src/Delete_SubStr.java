import java.util.ArrayList;
import java.util.Scanner;

public class Delete_SubStr {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        ArrayList<String> ilya = new ArrayList<String>(5);

        System.out.print("\nВведите пять строк");
        for (int i = 0; i<5 ; i++){
            System.out.print("\nВведите " + (i+1) + "-ю строку:");
            ilya.add(i,input.nextLine());
        }

        System.out.print("\nВведите ключевую строку:");
        String key = input.nextLine();

        for (int i = 0; i<5; i++){
            if (ilya.get(i).contains(key)){
                ilya.remove(i);
            }
        }
        for (String i: ilya){
            System.out.print("\n" + i);
        }

    }
}
