package prog_java;
import java.util.Scanner;

public class CalculoVenta {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir el precio del artículo al usuario
        System.out.print("Ingrese el precio del artículo: ");
        double precio = scanner.nextDouble();
        
        // Pedir la cantidad de artículos al usuario
        System.out.print("Ingrese la cantidad de artículos que lleva el cliente: ");
        int cantidad = scanner.nextInt();
        
        // Calcular el total a pagar
        double total = precio * cantidad;
        
        // Mostrar el total al comprador
        System.out.println("El total a abonar por el comprador es: $" + total);
        
        // Cerrar el scanner
        scanner.close();
    }
}



