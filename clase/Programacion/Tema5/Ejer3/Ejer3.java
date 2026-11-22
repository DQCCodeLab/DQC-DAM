/*
Repetir 10 veces.
    Pedir una nota al usuario
    Si la nota es aprobado sumar 1 a los aprobados
    Si la nota es menor a 5 sumar 1 a los suspensos
Escribir "Los aprobados son" aprobados
Escribir "Los suspensos son" suspensos
*/

import  java.util.Scanner;

class  Ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aprobados, suspensos;
        aprobados = suspensos = 0; // Esto es que aprobados es = a suspensos y suspensos = 0 es una curiosidad que se puede poner
        for(int i = 0; i < 10; i++) {
            System.out.print("Introduzca una nota del 1 al 10: ");
            double nota = Double.parseDouble(sc.nextLine().trim());
            if(nota >= 5.0) aprobados++;
            else suspensos++;
        }
        System.out.print("\nLos aprobados son " + aprobados);
        System.out.print("\nLos suspensos son " + suspensos);
    }
}
