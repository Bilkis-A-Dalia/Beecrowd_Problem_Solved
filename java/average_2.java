import java.io.IOException;
 import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
       
        float A,B,C,MEDIA;
        Scanner dalia=new Scanner(System.in);
        
        A=dalia.nextFloat();
        B=dalia.nextFloat();
        C=dalia.nextFloat();
        System.out.printf("MEDIA = %.1f\n",(A*2+B*3+C*5)/(2+3+5));
        
 
    }
 
}