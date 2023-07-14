import java.io.IOException;
import java.util.Scanner;
public class Main
{
 
    public static void main(String[] args) throws IOException
    {
 
     double A,B,C,pi=3.14159,TRIANGULO,CIRCULO,TRAPEZIO,QUADRADO,RETANGULO;
     
       Scanner dalia=new Scanner(System.in);
    A=dalia.nextDouble();
     B=dalia.nextDouble();
       C=dalia.nextDouble();
      
       TRIANGULO=0.5*A*C;
       CIRCULO=pi*(C*C);
       TRAPEZIO=(A+B)/2*C;
       QUADRADO=B*B;
       RETANGULO=A*B;
      
        System.out.printf("TRIANGULO: %.3f\n",TRIANGULO);
        System.out.printf("CIRCULO: %.3f\n",CIRCULO);
        System.out.printf("TRAPEZIO: %.3f\n",TRAPEZIO);
        System.out.printf("QUADRADO: %.3f\n",QUADRADO);
        System.out.printf("RETANGULO: %.3f\n",RETANGULO);
 
    }
 
}