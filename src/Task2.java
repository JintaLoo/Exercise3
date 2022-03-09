import java.io.*;
import java.lang.Math;

public class Task2
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float heightBielecki,weightBielecki;
        float BMI;
        System.out.println("A program that will calculate the BMI");
        System.out.print("Enter your Height = ");
        heightBielecki=Float.parseFloat(br.readLine());
        System.out.print("Enter your Weight = ");
        weightBielecki=Float.parseFloat(br.readLine());
        //Calculate BMI
        BMI=(float) (weightBielecki/Math.pow((heightBielecki/100),2));
        System.out.printf("Your BMI = %f \n",BMI);

        if(BMI<16)
        {
            System.out.print("Starvation");
        }
        else if(BMI>=16&&BMI<=16.99)
        {
            System.out.print("Emaciation");
        }
        else if(BMI>=17&&BMI<=18.49)
        {
            System.out.print("Underweight");
        }
        else if(BMI>=18.5&&BMI<=22.99)
        {
            System.out.print("Normal,Low range");
        }
        else if(BMI>=23&&BMI<=24.99)
        {
            System.out.print("Normal,High range");
        }
        else if(BMI>=25&&BMI<=27.49)
        {
            System.out.print("Overweight,Low range");
        }
        else if(BMI>=27.5&&BMI<=29.99)
        {
            System.out.print("Overweight,High range");
        }
        else if(BMI>=30&&BMI<=34.9)
        {
            System.out.print("1st degree obesity");
        }
        else if(BMI>=35&&BMI<=39.9)
        {
            System.out.print("2nd degree obesity");
        }
        else if(BMI<=40)
        {
            System.out.print("3rd degree obesity");
        }


    }
}
