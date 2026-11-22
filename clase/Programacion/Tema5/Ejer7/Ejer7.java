import java.util.Scanner;

class Ejer7{
    public static void main(String[] args) {
        Scanner tecladoInput = new Scanner(System.in);
        
        Double auxSuma = 0.0;
        int cantNumero = 1;
        for(int i = 0; i < 10; i++) {
            System.out.print("Ingrese su numero " + cantNumero + ">");
            Double n = Double.parseDouble(tecladoInput.nextLine().trim());
            cantNumero++;
            if(i > 5) {
                auxSuma += n;
            }
        }
        System.out.print("La suma de los ultimos 5 numeros es " + auxSuma);
    }
}
