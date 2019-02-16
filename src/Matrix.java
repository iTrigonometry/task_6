public class Matrix {
    final static int A = 10;
    final static int B = -10;
    public static void main(String[] args){
        float[][] arrf = new float[3][3];

        //a11a22a33+a12a23a31+a21a32a13−a13a22a31−a23a32a11−a12a21a33
        for(int i = 0; i<3;i++){
            for(int j= 0;j<3;j++){
                arrf[i][j] = (float) (Math.random() * (B - A)) + A;
            }
        }
        vivod(arrf);
    }
    public static void vivod(float[][] array){
        for (int i = 0; i < 3; i++){
            for (int j=0; j<3; j++) {
                System.out.print(array[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
