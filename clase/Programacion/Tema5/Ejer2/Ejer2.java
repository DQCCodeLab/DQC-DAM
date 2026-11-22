import java.util.Scanner;

class Ejer2 {
    public static void main(String[] args) {
        
        Scanner tecladoInput = new Scanner(System.in);

        System.out.print("Dime un numero y te dire cuantas cifras tiene> ");
        int n = Integer.parseInt(tecladoInput.nextLine().trim());
        int nInicial = n;
        int auxcifras = 0;
        int cifras = 0;
        for(int i = 0; n != 0; i++) {
            n = n / 10;
            cifras++;
        }
        System.out.print(nInicial + " Tiene " + cifras + " cifras");
    }
}