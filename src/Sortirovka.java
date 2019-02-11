import java.util.ArrayList;
import java.util.Random;

public class Sortirovka {
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public static void main(String[] args){

        System.out.print("Выберите действие.");
        randomNum();
    }

    public static void randomNum(){
        Random rand = new Random();

        ArrayList<Integer> arrint = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++){
            arrint.add(i, rand.nextInt(100) - 50);
        }

        ArrayList<Integer> sort = new ArrayList<Integer>();
        int min = arrint.get(0);
        for (int i : arrint){
            if (min < arrint.get(i)){
                
        }
    }
}
