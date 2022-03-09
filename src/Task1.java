import java.io.*;
import java.nio.Buffer;
import java.util.function.BiConsumer;


public class Task1
{
    public static void main(String[] args) throws IOException
    {
        float firstNumberBielecki, secondNumberBielecki;
        float sum, difference, product,quotient;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("A program that will calculate sum, difference, product and a quotient for two user-entered numbers");
        System.out.print("Enter a First Number = ");
        firstNumberBielecki=Float.parseFloat(br.readLine());
        System.out.print("Enter a Second Number = ");
        secondNumberBielecki=Float.parseFloat(br.readLine());
        //Calculate part
        sum=firstNumberBielecki+secondNumberBielecki;
        difference=firstNumberBielecki-secondNumberBielecki;
        product=firstNumberBielecki*secondNumberBielecki;
        quotient=firstNumberBielecki/secondNumberBielecki;
        //Display
        System.out.printf("The first Number = %.2f and second number = %.2f \n",firstNumberBielecki,secondNumberBielecki);
        System.out.printf("The answer for the sum = %.2f \n",sum);
        System.out.printf("The answer for the difference = %.2f \n",difference);
        System.out.printf("The answer for the product = %.2f \n",product);
        System.out.printf("The answer for the quotient = %.2f \n",quotient);
    }
}
