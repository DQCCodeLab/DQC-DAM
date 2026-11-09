import java.util.Scanner;

class Ejer1 {
	public static void main(String args[]){

		Scanner tecladoInput = new Scanner(System.in);
		
		// Bloque de estados constantes
		final int ESTADO_SUMA = 1;
		final int ESTADO_RESTA = 2;
		final int ESTADO_MULTIPLICACION = 3;
		final int ESTADO_DIVISION = 4;
		final int ESTADO_SALIR = 5;

		while(true) {

			System.out.print("\n1 ---- Suma\n2 ---- Resta\n3 ---- Multiplicacion\n4 ---- Division\n5 ---- Salir\n Selecione su opcion tecleando algun numero de las opciones disponibles> ");

			int opcion = Integer.parseInt(tecladoInput.nextLine().trim());	
			
			
			switch(opcion) {
				case ESTADO_SUMA:
					System.out.print("Dime tu primer numero> ");
					Double n1 = Double.parseDouble(tecladoInput.nextLine().trim());

					System.out.print("Dime tu segundo numero> ");
					Double n2 = Double.parseDouble(tecladoInput.nextLine().trim());

					System.out.print("La suma de " + n1 + " + " + n2 + " da un total de: " + (n1 + n2) + "\n");
					break;

				case ESTADO_RESTA:
					System.out.print("Dime tu primer numero> ");
					n1 = Double.parseDouble(tecladoInput.nextLine().trim());

					System.out.print("Dime tu segundo numero> ");
					n2 = Double.parseDouble(tecladoInput.nextLine().trim());

					System.out.print("La resta de " + n1 + " + " + n2 + " da un total de: " + (n1 - n2) + "\n");
					break;


				case ESTADO_MULTIPLICACION:
					System.out.print("Dime tu primer numero> ");
					n1 = Double.parseDouble(tecladoInput.nextLine().trim());

					System.out.print("Dime tu segundo numero> ");
					n2 = Double.parseDouble(tecladoInput.nextLine().trim());

					System.out.print("La multiplicacion de " + n1 + " + " + n2 + " da un total de: " + (n1 * n2) + "\n");
					break;


				case ESTADO_DIVISION:
					System.out.print("Dime tu primer numero> ");
					n1 = Double.parseDouble(tecladoInput.nextLine().trim());

					System.out.print("Dime tu segundo numero> ");
					n2 = Double.parseDouble(tecladoInput.nextLine().trim());

					System.out.print("La division de " + n1 + " + " + n2 + " da un total de: " + (n1 / n2) + "\ncon un resto de " + (n1 % n2) + "\n");
					break;
					
			}
			if(opcion == 5) {
				System.out.print("Hasta luego");
				break;
			}
			if(opcion != ESTADO_SUMA && opcion != ESTADO_RESTA && opcion != ESTADO_MULTIPLICACION && opcion != ESTADO_DIVISION && opcion != 5){
				System.out.print("Opcion erronea vuelva a teclear su opcion");
			}
		}

	}
}