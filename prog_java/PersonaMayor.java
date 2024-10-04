package prog_java;

public class PersonaMayor {
    
    //Ejemplo 4. Persona mayor
    //En una encuesta en la que participan varias personas se pide, 
    //entre varias cosas, el nombre y la edad de la persona.
    //De estas personas se escogerán aleatoriamente dos, pero solo se tendrán en cuenta los datos de la mayor entre ambas.
    // Construya un programa que solicite el nombre y edad de dos personas y determine el nombre de la persona con mayor edad.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos de la primera persona
        System.out.println("Ingrese el nombre de la primera persona:");
        String nombre1 = scanner.nextLine();
        System.out.println("Ingrese la edad de " + nombre1 + ":");
        int edad1 = scanner.nextInt();
        scanner.nextLine();  // Consumir la nueva línea

        // Solicitar datos de la segunda persona
        System.out.println("Ingrese el nombre de la segunda persona:");
        String nombre2 = scanner.nextLine();
        System.out.println("Ingrese la edad de " + nombre2 + ":");
        int edad2 = scanner.nextInt();

        // Comparar edades y determinar quién es mayor
        if (edad1 > edad2) {
            System.out.println(nombre1 + " es mayor con " + edad1 + " años.");
        } else if (edad2 > edad1) {
            System.out.println(nombre2 + " es mayor con " + edad2 + " años.");
        } else {
            System.out.println("Ambos tienen la misma edad.");
        }

        scanner.close();
    }
}
 

