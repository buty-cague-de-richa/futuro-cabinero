# Función para verificar si el número es múltiplo de 3 y de 5
def es_multiplo_de_15(numero):
    if numero % 3 == 0 and numero % 5 == 0:
        return True
    else:
        return False

# Solicitar al usuario que ingrese un número
numero = int(input("Ingresa un número: "))

# Verificar si el número es múltiplo de 15
if es_multiplo_de_15(numero):
    print(f"El número {numero} es múltiplo de 15.")
    
else:
    print(f"El número {numero} no es múltiplo de 15.")