# Función principal para realizar las operaciones
def operaciones_basicas():
    # Pedir al usuario los cuatro números enteros
    num1 = int(input("Ingrese el primer número entero: "))
    num2 = int(input("Ingrese el segundo número entero: "))
    num3 = int(input("Ingrese el tercer número entero: "))
    num4 = int(input("Ingrese el cuarto número entero: "))

    # Realizar la suma de los dos primeros números
    suma = num1 + num2

    # Realizar la multiplicación de los dos últimos números
    producto = num3 * num4

    # Mostrar los resultados
    print(f"La suma de {num1} y {num2} es: {suma}")
    print(f"El producto de {num3} y {num4} es: {producto}")

# Llamar a la función
operaciones_basicas()
