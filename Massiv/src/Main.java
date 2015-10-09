import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();

        int [] mas1 = new int [10];
        int [] mas2 = new int [10];
        int [] mas3 = new int [10];
        int [] mas4 = new int [10];
        int [] mas5 = new int [10];

        for(int i=0; i<mas1.length; i++) {
            mas1[i] = rand.nextInt(20);
            System.out.print(mas1[i] + " ");
        }
        System.out.println();

        Arrays.sort(mas1);
        for (int j=0; j<mas1.length; j++) {
            System.out.print(mas1[j] + " ");
        }

        System.out.println();

        for(int i=0; i<mas2.length; i++) {
            mas2[i] = rand.nextInt(20);
            System.out.print(mas2[i] +" ");

        }
        System.out.println();
        for(int i=0; i<mas3.length; i++) {
            mas3[i] = rand.nextInt(20);
            System.out.print(mas3[i]+" ");

        }
        System.out.println();
        for(int i=0; i<mas4.length; i++) {
            mas4[i] = rand.nextInt(20);
            System.out.print(mas4[i]+" ");

        }
        System.out.println();
        for(int i=0; i<mas5.length; i++) {
            mas5[i] = rand.nextInt(20);
            System.out.print(mas5[i] + " ");

        }

    }

}