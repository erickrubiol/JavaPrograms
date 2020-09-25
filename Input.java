import java.util.Scanner;

public class Input{
    public static void main(String args[]){
        Scanner UserInput = new Scanner(System.in);
        String nombre = "";
        int numUno = 0, numDos = 0, resultado = 0;
        
        System.out.println("Hola, ¿Cuál es tu nombre?");
        nombre = UserInput.nextLine();
        
        System.out.println("Introduce el primer valor:");
        numUno = UserInput.nextInt();
        
        System.out.println("Introduce el segundo valor:");
        numDos = UserInput.nextInt();
        
        resultado = numUno + numDos;
        
        System.out.println(nombre + ",la suma de los dos números es " + resultado);
    }
}
