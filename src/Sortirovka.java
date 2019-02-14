import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Sortirovka {
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public static void main(String[] args) {
        int[] empty = new int[10];
        System.out.print("1.Ввести числа самому. 2.Числа будут рандомные\n");
        System.out.print("Выберите действие: ");
        Scanner scan = new Scanner(System.in);
        int action = scan.nextInt();
        if (action == 1) {
            for (int i = 0; i < 10; i++) {
                System.out.print("\nВведите число: ");
                empty[i] = scan.nextInt();
            }
            vivod(empty);
            randomNum(false, empty);
        } else {
            Random rand = new Random();
            for (int i = 0; i < empty.length; i++)
                empty[i] = rand.nextInt(100) - 50;
            vivod(empty);
            randomNum(true, empty);
        }
    }

    public static void randomNum(boolean flag, int[] arr) {

        if (flag) {
            int[] arrInt = arr;
            int temp;
            for (int i = arrInt.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (Math.abs(arrInt[j]) > Math.abs(arrInt[j + 1])) {
                        temp = arrInt[j];
                        arrInt[j] = arrInt[j + 1];
                        arrInt[j + 1] = temp;
                    }
                }
            }
            vivod(arrInt);
        } else {
            int[] arrInt = arr;
            int temp;
            for (int i = arrInt.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (Math.abs(arrInt[j]) > Math.abs(arrInt[j + 1])) {
                        temp = arrInt[j];
                        arrInt[j] = arrInt[j + 1];
                        arrInt[j + 1] = temp;
                    }
                }
            }
            vivod(arrInt);
        }
    }

    public static void vivod(int[] arr) {
        System.out.print("\nМассив\n");
        for (int j : arr) {
            System.out.print("    " + j);
        }
    }
}



