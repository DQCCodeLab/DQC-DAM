/*
valor = 11
Repetir 25 veces:
    Escribir valor
    sumar 11 a valor 

*/

class Ejer6 {
    public static void main(String[] args) {
        int valor = 11;
        for(int i = 0; i < 25; i++) {
            System.out.print("\n" + valor);
            valor +=11;
        }
    }
}
