import java.lang.Math;
public class Task5
{
    public static void main(String[] args)
    {
      double max=0,min=0;
      double rdm;

      for(int i=1;i<=10;i++)
      {
          rdm=Math.random()*100;
          System.out.print((int)rdm + " ");
          if(max<rdm)
          {max=rdm;}
          if(min==0)
          {min=rdm;}
          if (rdm<min)
          {min = rdm;}
      }
      System.out.println("");
      System.out.println("Maximum Number = "+(int)max);
      System.out.println("Minimum Number = "+(int)min);
    }
}
