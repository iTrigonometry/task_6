import java.util.Scanner;

public class Even_Odd_Str {
    public static void main(String[] args){
        String[] ilya = new String[5];

        Scanner input = new Scanner(System.in);

        System.out.print("\nВведите пять строк");
        for (int i = 0; i<5 ; i++){
            System.out.print("\nВведите " + (i+1) + "-ю строку:");
            ilya[i] = input.nextLine();
        }

        for (int  i = 0; i<5; i++){
            if (ilya[i].length() %2 == 0)
                System.out.print("\n" + ilya[i].toUpperCase());
            else
                System.out.print("\n" + ilya[i].toLowerCase());
        }

    }
}
