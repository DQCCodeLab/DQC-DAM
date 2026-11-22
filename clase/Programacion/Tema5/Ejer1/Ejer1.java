import java.util.Scanner;

class Ejer1 {
	public static void main(String args[]) {

		Scanner tecladoInput = new Scanner(System.in);
		
		System.out.print("Siempre debe introducir un numero entero y positivo");
		System.out.print("Dime un numero y te dire si es un numero perfecto> ");
		int n1 = Integer.parseInt(tecladoInput.nextLine().trim());
        int auxsuma = 0;

		for(int i = 1; i < n1; i++) {
			if(n1 % i == 0) {
				System.out.print(i + " es divisor de " + n1 + "\n");
                auxsuma += i;
			}
		}
        if(auxsuma == n1) System.out.print(n1 + " Es un numero perfecto\n");
        else System.out.print(n1 + " No es un numero perfecto\n");
	}
}