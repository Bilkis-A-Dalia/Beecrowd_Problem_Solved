import java.io.IOException;
 
import java.util.Scanner;
public class Main 
{
 
    public static void main(String[] args) throws IOException 
    {
 
       int a,b;

       double c,d;
     
       Scanner dalia=new Scanner(System.in);
       a=dalia.nextInt();
       b=dalia.nextInt();
       c=dalia.nextDouble();
       d=b*c;
       
       a=dalia.nextInt();
       b=dalia.nextInt();
       c=dalia.nextDouble();
       d+=b*c;
       
        
     
      
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",d);
        
    }
 
}