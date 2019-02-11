import java.util.ArrayList;
import java.util.Random;

public class Sortirovka {
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public static void main(String[] args) {
        randomNum();
    }

    public static void randomNum() {
        Random rand = new Random();

        int[] arrint = new int[10];
        for (int i = 0; i<arrint.length; i++)
            arrint[i] = rand.nextInt(100) - 50;
        int temp;
        for (int i = arrint.length - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if (Math.abs(arrint[j]) > Math.abs(arrint[j+1])){
                    temp = arrint[j];
                    arrint[j] = arrint[j+1];
                    arrint[j+1] = temp;
                }
            }
        }

        for (int j : arrint)
            System.out.print("   " + j);
    }
}
