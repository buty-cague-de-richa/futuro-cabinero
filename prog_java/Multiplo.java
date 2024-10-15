package prog_java;

public class Multiplo {









    
        public static void main(String[] args) {
            // Crear un objeto Scanner para leer la entrada del usuario
            Scanner scanner = new Scanner(System.in);
    
            // Solicitar al usuario que ingrese un número
            System.out.print("Ingresa un número: ");
            int numero = scanner.nextInt();
    
            // Verificar si el número es múltiplo de 3 y de 5
            if (numero % 3 == 0 && numero % 5 == 0) {
                System.out.println("El número " + numero + " es múltiplo de 15.");
            } else {
                System.out.println("El número " + numero + " no es múltiplo de 15.");
            }
    
            // Cerrar el scanner
            scanner.close();
        }
    }
     
