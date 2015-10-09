
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //все хорошо
        Random rand = new Random();

        int[] mas1 = new int[4];


        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = rand.nextInt(99);
            System.out.print(mas1[i] + " ");
        }

        if (mas1[0] < mas1[1] && mas1[1] < mas1[2] && mas1[3] < mas1[4] )
            System.out.println("cool");
        else{
            System.out.println("bad");
        }




        }





        }

