import java.io.IOException;
 
import java.util.Scanner;
public class Main 
{
 
    public static void main(String[] args) throws IOException 
    {
           double R,VOLUME;
     
       Scanner dalia=new Scanner(System.in);
     
       R=dalia.nextDouble();
       VOLUME=(4/3.0) *3.14159* R*R*R;
      
        System.out.printf("VOLUME = %.3f\n",VOLUME);
    }
 
}