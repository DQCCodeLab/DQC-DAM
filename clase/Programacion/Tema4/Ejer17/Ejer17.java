import java.util.Scanner;

class Ejer17 {
	public static void main(String args[]) {

		Scanner tecladoInput = new Scanner(System.in);


		int acertado = 0;
		while(acertado == 0){

			System.out.print("Intenta adivinar los caracteres permitidos (pon solo 1 caracter es decir (a) (b) asi un colo caracter: Pista se distinguen mayusculas de minusculas> ");
			String caracterInput = tecladoInput.nextLine().trim();

			


		
			if(caracterInput.equals("S") || caracterInput.equals("N")) {

				System.out.print("Correcto lo adivinaste. Es el caracter " + caracterInput);
				acertado = 1;
				break;
			} else 	System.out.print("Fallaste no es el cacter " + caracterInput + " Dime otro caracter\n");

		}
	}
}