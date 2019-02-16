import java.util.Random;

public class FirstPositiveLastNegative {
    public static void main(String[] args){
        float[] darr = new float[10];
        float[] tempdarr = new float[10];
        for (int i = 0;i<darr.length;i++){
            darr[i] = (float) ((Math.random() * (-5 - 5)) + 5);
        }
        vivod(darr);
        int index = 0;

        for (int j = 0; j< darr.length; j++){
            if (darr[j] > -1){
                tempdarr[index] = darr[j];
                ++index;
            }
        }

        for (int i = 0; i<darr.length; i++){
            if (darr[i] < 0){
                tempdarr[index] = darr[i];
                ++index;
            }
        }

        vivod(tempdarr);


    }
    public static void vivod(float[] arr) {
        System.out.print("\nМассив\n");
        for (float j : arr) {
            System.out.print("    " + j);
        }
    }
}
