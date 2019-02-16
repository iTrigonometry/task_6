public class DvumerniyMassiv {
    //+++++++++++++++++++++
    //Диапазон от [a;b)
    //+++++++++++++++++++++
    static final int A = 5;
    static final int B = 100;
    public static void main(String[] args){
        int[][] arr = new int[4][4];

        for (int i = 0; i < 4; i++){
            for (int j=0; j<4; j++){
                arr[i][j] = (int)(Math.random() * (B-A)) + A;
            }
        }

        vivod(arr);

        int[] temparr = new int[4];
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 3; j++) {
                if (arr[j][1] > arr[j + 1][1]) {
                    temparr = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temparr;
                }
            }
        }
        System.out.println();
        vivod(arr);

    }

    public static void vivod(int[][] array){
        for (int i = 0; i < 4; i++){
            for (int j=0; j<4; j++) {
                System.out.print(array[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
