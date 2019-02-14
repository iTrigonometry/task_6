import java.util.Scanner;

public class DoubleSortirovka {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[] arrD = new double[10];
        for (int i = 0; i<arrD.length;i++){
            System.out.print("\nВведите число: ");
            arrD[i] = input.nextDouble();
        }
        vivod(arrD);
        sort(arrD);
    }
    
    public static void sort(double[] arrdoubl){
        double temp;
        double[] arrdouble = arrdoubl;
        for (int i = arrdouble.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (Math.abs(arrdouble[j]) > Math.abs(arrdouble[j + 1])) {
                    temp = arrdouble[j];
                    arrdouble[j] = arrdouble[j + 1];
                    arrdouble[j + 1] = temp;
                }
            }
        }
        vivod(arrdoubl);
    }
    public static void vivod(double[] arr) {
        System.out.print("\nМассив\n");
        for (double j : arr) {
            System.out.print("    " + j);
        }
    }
}
