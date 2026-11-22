import java.util.Scanner;

class Ejer8 {
    public static void main(String[] args) {
        Scanner tecladoInput = new Scanner(System.in);
        
        System.out.print("Dime un numero entre el 1 y el 10> ");
        int n = Integer.parseInt(tecladoInput.nextLine().trim());

        System.out.print("La tabla de multiplicar del " + n + " Es la siguiente\n");
        for(int i = 0; i < 11; i++) {
            System.out.print(n + " x " + i + " = " + (n * i) + "\n");
        }
    }
}