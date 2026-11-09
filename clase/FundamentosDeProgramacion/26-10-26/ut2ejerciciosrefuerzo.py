import math
import random
import time
import datetime

minutos_totales = 275

horas_completadas = minutos_totales / 60
auxhoras_completadas = minutos_totales % 60
print(int(horas_completadas), "horas y", auxhoras_completadas, "minutos" )

temperatura = 22

humedad = 65#%

auxcomprobar = temperatura >= 20 and temperatura <= 25  and humedad < 70

print("Te dire si es verdad o falso que el aula es confortable: " + str(auxcomprobar))

precio_producto = "19.99"
unidades_producto = "3"

precio_producto = float(precio_producto)
unidades_producto = int(unidades_producto)

precio_final = precio_producto * unidades_producto
redondeo = round(precio_final, 0)
print("El precio final es: " + str(precio_final) + " redondeado seria: " + str(redondeo))