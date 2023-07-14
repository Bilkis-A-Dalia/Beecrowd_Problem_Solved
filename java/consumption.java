import java.io.IOException;
import java.util.Scanner;
public class Main 
{
 
    public static void main(String[] args) throws IOException
    {
 int a;
double b,average;
     
       Scanner dalia=new Scanner(System.in);
       a=dalia.nextInt();
       b=dalia.nextDouble();
         
       average=a/b;
       
         System.out.printf("%.3f km/l\n",average);
 
    }
 
}