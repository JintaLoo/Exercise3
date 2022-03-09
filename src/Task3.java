import java.io.*;
import java.lang.Math;

public class Task3
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a, b, c, delta, x1, x2; char rootsNumber = 0;
        System.out.println("A program that calculate the roots of the equation ax^2+bx+c = 0");
        System.out.print("Enter first number = ");
        a = Double.parseDouble(br.readLine ());
        if (a == 0)
        {
            System.out.println("Illegal value of the coefficient a");
        }
        else
        {
            System.out.print("Enter second number = ");
            b = Double.parseDouble(br.readLine());
            System.out.print("Enter third number = ");
            c = Double.parseDouble(br.readLine());

            delta = Math.pow(b, 2) - 4 * a * c; // of course from the formula delta = b^2 - 4ac

            if (delta < 0) rootsNumber = 0;
            if (delta == 0) rootsNumber = 1;
            if (delta > 0) rootsNumber = 2;

            switch (rootsNumber) {
                case 0:
                    System.out.println("There are no real roots");
                    break;
                case 1: {
                    x1 = -b / (2 * a);
                    System.out.printf("For a = " + "%4.2f,", a);
                    System.out.printf(" b = " + "%4.2f,", b);
                    System.out.printf(" c = " + "%4.2f,", c);
                    System.out.print("the trinomial has one double root = ");
                    System.out.printf("%4.2f.\n", x1);
                }
                break;
                case 2: {
                    x1 = (-b - (Math.sqrt(delta))) / (2 * a);
                    x2 = (-b + (Math.sqrt(delta))) / (2 * a);
                    System.out.printf("For a = " + "%4.2f,", a);
                    System.out.printf(" b = " + "%4.2f,", b);
                    System.out.printf(" c = " + "%4.2f. \n", c);
                    System.out.print(" x1 = ");
                    System.out.printf("%4.2f.\n", x1);
                    System.out.print(" x2 = ");
                    System.out.printf("%4.2f. \n", x2);
                }
                break;
            }
        }

    }
}
