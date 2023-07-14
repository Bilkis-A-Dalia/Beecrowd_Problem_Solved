import java.io.IOException;
 
import java.util.Scanner;
public class Main
{
 
    public static void main(String[] args) throws IOException 
    {
 
       
        float A,B,MEDIA;
        Scanner dalia=new Scanner(System.in);
        
        A=dalia.nextFloat();
        B=dalia.nextFloat();
        
        System.out.printf("MEDIA = %.5f\n", (A*3.5+B*7.5)/(3.5+7.5));
        
    }
 
}