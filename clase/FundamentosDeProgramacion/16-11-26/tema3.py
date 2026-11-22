#Ejercicios Bloque 1

#ejercicio 1

numero = -0.0002

if numero < 0:
    print("El numero es negativo")
elif numero == 0:
    print("El numero es 0")
elif numero > 0:
    print("El numero es positivo")

#ejercicio 2

edad = int(input("Digame su edad> "))

if edad >=65:
    print("La entrada cuesta 6€")
elif edad >=13 & edad <= 64:
    print("La entrada cuesta 9€")
elif edad >= 4 & edad <= 12:
    print("La entrada cuesta 5€")
elif edad < 4:
    print("La entrada es gratuita")

# ejercicio 3

carnet_en_vigor = True
libros_pestados = 2
es_profesor = False

if (carnet_en_vigor == True) and (libros_pestados < 3 or es_profesor == True):
    print("Prestamo concedido")
else:
    print("Prestamo denegado")

# Ejercicio 4

temperatura = float(input("Dame una temperatura> "))

if temperatura < 15:
    print("Lleva abrigo")
elif temperatura > 15:
    print("no hace falta abrigo")

# Ejercicio 5

mes_user_input = int(input("Dime un numero de mes> "))

