import java.util.Scanner;

public class CosinusPlusTangens {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double a, b, mShag;

        System.out.print("Введите а: ");
        a = input.nextDouble();
        System.out.print("\nВведите b: ");
        b = input.nextDouble();
        System.out.print("\nВведите m: ");
        mShag = input.nextDouble();

        for (;a<=b;a+=mShag){
            System.out.print("\ncos(" + a + ") + tg(" + a + ") = "+ (float)(Math.cos(a * 180/3.14) + Math.tan(a*180/3.14)));
        }
    }
}
