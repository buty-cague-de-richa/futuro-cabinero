package prog_java;

    import java.util.Scanner;

    public class PerimetroCuadrado {
        public static void main(String[] args) {
            // Crear un objeto Scanner para leer la entrada del usuario
            Scanner scanner = new Scanner(System.in);
            
            // Solicitar al usuario que ingrese la longitud del lado
            System.out.print("Ingrese la longitud del lado del cuadrado: ");
            double lado = scanner.nextDouble();
            
            // Calcular el perímetro
            double perimetro = calcularPerimetro(lado);
            
            // Mostrar el resultado
            System.out.println("El perímetro del cuadrado es: " + perimetro);
            
            // Cerrar el scanner
            scanner.close();
        }
    
        // Método para calcular el perímetro del cuadrado
        public static double calcularPerimetro(double lado) {
            return lado * 4;
        }
    }
      
