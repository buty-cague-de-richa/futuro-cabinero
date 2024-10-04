package prog_java;

public class Mayor {
    
//Ejemplo 3:   Número mayor
//En una oficina con mas de 100 empleados deseen saber,por cada pareja posible,cuál persona tiene un salario más alto que la otra.
//Se le pide diseñar un programa que pida por teclado dos números diferentes y determine cuál es el mayor entre los dos.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos el primer número
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        // Pedimos el segundo número
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        // Comprobamos si son diferentes
        if (num1 == num2) {
            System.out.println("Los números son iguales. Por favor, ingrese números diferentes.");
        } else {
            // Comparamos los números y mostramos el mayor
            if (num1 > num2) {
                System.out.println("El número mayor es: " + num1);
            } else {
                System.out.println("El número mayor es: " + num2);
            }
        }
        
        scanner.close();
    }
}

