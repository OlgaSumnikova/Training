import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                double n;
                double m;
                int a=10;

        System.out.println("Enter an integer ");
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

                double b=Math.abs(a-n);
                double c=Math.abs(a-m);

                if(b>c){
                    System.out.println("Число "+m+" ближе к "+a);
                }
                if (b<c) {
                    System.out.println("Число "+n+" ближе к "+a);
                }
            }



        }