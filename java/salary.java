import java.io.IOException;
 
import java.util.Scanner;
public class Main 
{
 
    public static void main(String[] args) throws IOException 
    {
 
        int NUMBER,hours;
        float amount,SALARY;
        Scanner dalia=new Scanner(System.in);
        
        NUMBER=dalia.nextInt();
        hours=dalia.nextInt();
        amount=dalia.nextFloat();
        
        SALARY=hours*amount;
        
        System.out.println("NUMBER = "+NUMBER);
        System.out.printf("SALARY = U$ %.2f\n",SALARY);
 
    }
 
}