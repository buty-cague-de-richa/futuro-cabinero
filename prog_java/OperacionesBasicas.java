package prog_java;

    import java.util.Scanner;

public class OperacionesBasicas {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir los cuatro números al usuario
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();
        
        System.out.print("Ingrese el cuarto número: ");
        int num4 = scanner.nextInt();
        
        // Calcular la suma de los dos primeros números
        int suma = num1 + num2;
        
        // Calcular el producto de los dos últimos números
        int producto = num3 * num4;
        
        // Mostrar los resultados
        System.out.println("La suma de los dos primeros números es: " + suma);
        System.out.println("El producto de los dos últimos números es: " + producto);
        
        // Cerrar el scanner
        scanner.close();
    }
}


