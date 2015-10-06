import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a, b, c;
        double d;

        System.out.println("Enter an integer to calculate ");
        Scanner in = new Scanner(System.in);

        //При значениях 1, 2, 3 соответственно - программа не выдает ошибки, но и не отрабатывает. В if нет обработки d<0
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        double x1, x2;
        d = (b * b) - (4 * a * c);

        if (d == 0) {
            x1 = (-b) / (2 * a);
            System.out.println("x1 is " + x1);
        } else if (d>0) {
            x1 = (-b - Math.sqrt(d) / 2 * a);
            x2 = (-b + Math.sqrt(d) / 2 * a);
            System.out.println("x1 is " + x1);
            System.out.println("x2 is " + x2);
        }

        else
        {
            if (d > 0) {
                //Точно ли any way?
                System.out.println("There is any way to resolve");
            }

        }
    }
}