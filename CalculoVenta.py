# Función para calcular el total a pagar
def calcular_total():
    # Pedir al usuario el precio del artículo
    precio = float(input("Ingrese el precio del artículo: "))

    # Pedir al usuario la cantidad de artículos que lleva
    cantidad = int(input("Ingrese la cantidad de artículos que lleva: "))

    # Calcular el total a pagar
    total = precio * cantidad

    # Mostrar el total que debe abonar el cliente
    print(f"El total a pagar por {cantidad} artículo(s) es: ${total:.2f}")

# Llamar a la función
calcular_total()    

