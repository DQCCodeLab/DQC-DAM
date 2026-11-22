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

match mes_user_input:
    case 1 | 2 | 12:
        print("La estacion del mes " + str(mes_user_input) + "  es Invierno")
    case 3 | 4 | 5:
        print("La estacion del mes " + str(mes_user_input) + "  es Primavera")
    case 6 | 7 | 8:
        print("La estacion del mes " + str(mes_user_input) + "  es Verano")
    case 9 | 10 | 11:
        print("La estacion del mes " + str(mes_user_input) + "  es Otoño")
    case _:
        print("Numero o dato equivocado")

# Ejercicio 6

saldo = 1000
interes_anual = 1.05
annos_tardados = 0
while (saldo < 2000):
    saldo *= interes_anual
    annos_tardados += 1

print("has tardado con tu interes en alcanzar los 2000€ " + str(annos_tardados) + " años")
