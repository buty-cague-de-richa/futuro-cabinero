# Solicitar el nombre y edad de la primera persona
nombre1 = input("Ingresa el nombre de la primera persona: ")
edad1 = int(input(f"Ingresa la edad de {nombre1}: "))

# Solicitar el nombre y edad de la segunda persona
nombre2 = input("Ingresa el nombre de la segunda persona: ")
edad2 = int(input(f"Ingresa la edad de {nombre2}: "))

# Comparar las edades y mostrar el nombre de la persona mayor
if edad1 > edad2:
    print(f"La persona con mayor edad es {nombre1} con {edad1} años.")
elif edad2 > edad1:
    print(f"La persona con mayor edad es {nombre2} con {edad2} años.")
else:
    print(f"Ambas personas tienen la misma edad: {edad1} años.")
