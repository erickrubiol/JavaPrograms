import java.util.Scanner;

public class Sistema{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        String nombre = "";
        int clave = 0, antiguedad = 0;
        
        System.out.println("***********************************************");
        System.out.println("*Bienvenido al sistema vacacional de Coca-Cola*");
        System.out.println("***********************************************");
        System.out.println("");
        System.out.println("");
        
        System.out.print("Indicar el nombre del trabajador: ");
        nombre = entrada.nextLine();
        System.out.println("");
        
        System.out.print("Tiempo de servicio del trabajador: ");
        antiguedad = entrada.nextInt();
        System.out.println("");
        
        System.out.print("Clave del trabajador: ");
        clave = entrada.nextInt();
        System.out.println("");
        
        if(clave == 1){
            if(antiguedad == 1){
                System.out.println(nombre + ", derecho 6 días.");
            } else if(antiguedad >= 2 && antiguedad <= 6){
                System.out.println(nombre + ", derecho 14 días.");
            } else if(antiguedad == 7){
                System.out.println(nombre + ", derecho 20 días.");
            } else{
                System.out.println("Aún no tiene derecho a vacaciones");
            }
        } else if(clave == 2){
            if(antiguedad == 1){
                System.out.println(nombre + ", derecho 7 días.");
            } else if(antiguedad >= 2 && antiguedad <= 6){
                System.out.println(nombre + ", derecho 15 días.");
            } else if(antiguedad == 7){
                System.out.println(nombre + ", derecho 22 días.");
            } else{
                System.out.println("Aún no tiene derecho a vacaciones");
            }
        } else if(clave == 3){
            if(antiguedad == 1){
                System.out.println(nombre + ", derecho 10 días.");
            } else if(antiguedad >= 2 && antiguedad <= 6){
                System.out.println(nombre + ", derecho 20 días.");
            } else if(antiguedad == 7){
                System.out.println(nombre + ", derecho 30 días.");
            } else{
                System.out.println("Aún no tiene derecho a vacaciones.");
            }
        }else{
            System.out.println("Error, la clave es incorrecta.");
        }
    }
}
