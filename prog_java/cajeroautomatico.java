
package prog_java;

import java.util.Scanner;

public class cajeroautomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar el monto a retirar
        System.out.print("Ingrese el monto a retirar (debe ser multiplo de 10): ");
        int monto = scanner.nextInt();
        
        // Validar que el monto sea un múltiplo de 10
        if (monto % 10 != 0) {
            System.out.println("El monto debe ser un múltiplo de 10.");
            return;
        }
        
        // Inicializar el conteo de billetes
        int billetes50 = 0;
        int billetes20 = 0;     
        int billetes10 = 0;

        // Calcular cantidad de billetes de 50
        billetes50 = monto / 50;
        monto %= 50; // Actualizar el monto restante

        // Calcular cantidad de billetes de 20
        billetes20 = monto / 20;
        monto %= 20; // Actualizar el monto restante

        // Calcular cantidad de billetes de 10
        billetes10 = monto / 10;
        monto %= 10; // Actualizar el monto restante

        // Mostrar el resultado
        System.out.println("Billetes a entregar:");
        System.out.println("Billetes de 50: " + billetes50);
        System.out.println("Billetes de 20: " + billetes20);
        System.out.println("Billetes de 10: " + billetes10);
        
        scanner.close();
    }
}


