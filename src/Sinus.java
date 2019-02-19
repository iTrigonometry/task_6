import java.util.Scanner;

public class Sinus {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        double a, b, mShag;

        System.out.print("Введите а: ");
        a = input.nextDouble();
        System.out.print("\nВведите b: ");
        b = input.nextDouble();
        System.out.print("\nВведите m: ");
        mShag = input.nextDouble();

        for (;a<=b;a+=mShag){
            System.out.print("\nsin(" + a + ") = " + (float)Math.sin(a));
        }

    }
}
