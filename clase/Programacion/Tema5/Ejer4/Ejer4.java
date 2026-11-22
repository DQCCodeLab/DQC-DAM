import java.util.Scanner;

class Ejer4 {
    public static void main(String[] args) {
        
        Scanner tecladoInput = new Scanner(System.in);
        System.out.print("Dime cuantas alturas de personas vas a registrar> ");
        int nalturas = Integer.parseInt(tecladoInput.nextLine().trim());
        int contadoraux = 0;
        double alturastotal = 0;
        for(int i = 0; i < nalturas; i++) {
            System.out.print("Dime tu altura en metros> ");
            Double altura = Double.parseDouble(tecladoInput.nextLine().trim());
            contadoraux ++;
            alturastotal += altura;
            if (contadoraux == nalturas) {
                System.out.print("El promedio de las alturas es> " + (alturastotal / nalturas) + " metros");
            }
        }
    }
}