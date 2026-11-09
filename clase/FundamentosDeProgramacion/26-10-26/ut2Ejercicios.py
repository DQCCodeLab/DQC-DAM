import math
import random
import time
import datetime
# 1er_apellido da error porque empieza con numero
# Nombre Cliente da error debido a que contiene espacios
# import daria error porque es una palabra reservada del sistema
# tasaIva funciona pero se deberia usar UPPER_SNAKE_CASE y quedaria TASA_IVA    
# numero_maximo_intentos esta bien nombrada es correcta

#Ej2 
# ---------
base_triangulo = 10
altura_triangulo = 5

area_triangulo = base_triangulo * altura_triangulo / 2

print("el area: " , area_triangulo)

def mostrar_encabezado():
    print("--- SISTEMA DE GESTIÓN INICIADO ---")

mostrar_encabezado()

def calcular_mitad(n1):
    print("La mitad es " , (n1 / 2) )

calcular_mitad(50)

def obtener_precio_iva(precio_base):
    IVA = 0.21
    resultado = precio_base * IVA
    return resultado

print(obtener_precio_iva(100))

def calculo_radio_circulo(r):
    """
    Función para calcular el area de un circulo\n
    param (float radio)
    return float
    """
    a = math.pi * math.pow(r , 2)
    return a

print(calculo_radio_circulo(20))

eleccion_alumno_alazar = random.randint(1 , 30)
print("El alumno al azar es el nº ", eleccion_alumno_alazar)

lista_textos = ["ataque", "Defensa", "Curacion"]

elemento_alzar = random.choice(lista_textos)

print(elemento_alzar)

num_float_random = random.uniform(50.5, 100.5)

print(round(num_float_random))

print("conectando al servidor porfavor sea paciente")
time.sleep(3)
print("Conectado con el servidor")

hoy = datetime.date.today()
dia_mes = hoy.day
dia_semana = hoy.weekday()

auxfuturo_45_dias = datetime.timedelta(days=45)

auxfuturo = auxfuturo_45_dias + hoy

print("Hoy es " , hoy)
print("Dentro de 45 dias sera ", auxfuturo)