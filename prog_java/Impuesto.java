public class Impuesto {
  
    

import java.util.Scanner;

public class Impuestos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el sueldo del trabajador
        System.out.print("Ingrese el sueldo del trabajador: ");
        double sueldo = scanner.nextDouble();

        // Verificar si el sueldo es mayor a 3000 para determinar si debe pagar impuestos
        if (sueldo > 3000) {
            System.out.println("El trabajador debe pagar impuestos.");
        } else {
            System.out.println("El trabajador no debe pagar impuestos.");
        }

        scanner.close();
    }
}

}
