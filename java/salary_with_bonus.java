import java.io.IOException;
 
import java.util.Scanner;
public class Main 
{
 
    public static void main(String[] args) throws IOException 
    {
 
        double value,salary=0,TOTAL;
        String name;
        Scanner dalia=new Scanner(System.in);
        name=dalia.next();
        value=dalia.nextDouble();
        salary=dalia.nextDouble();
        
        TOTAL=value+salary*0.15;
      
        System.out.printf("TOTAL = R$ %.2f\n",TOTAL);
    }
 
}