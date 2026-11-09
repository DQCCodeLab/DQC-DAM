import java.util.Scanner;

class Ejer15 {
	public static void main(String args[]) {

		Scanner tecladoInput = new Scanner(System.in);

		System.out.print("Dime tu nombre> ");
		String nombreInput = tecladoInput.nextLine().trim();

		System.out.print(nombreInput + " ¿Usted trabaja? (Responda con si o no)> ");
		String trabajaSiNo = tecladoInput.nextLine().trim().toLowerCase();
		
		System.out.print(nombreInput + " ¿Usted esta estudiando? (Responda con si o no)> ");
		String estudiaSiNo = tecladoInput.nextLine().trim().toLowerCase();
		
		if(trabajaSiNo.equals("si") && estudiaSiNo.equals("si")){
			System.out.print(nombreInput + " ¿De que trabajas?> ");
			String trabajo = tecladoInput.nextLine().trim();
			
			System.out.print(nombreInput + " ¿Usted que estudia?> ");
			String estudia = tecladoInput.nextLine().trim();
			
			System.out.print("El señor/a " + nombreInput + " Esta trabajando de " + trabajo + " , ademas esta estudiando " + estudia);
		} else if(trabajaSiNo.equals("no") && estudiaSiNo.equals ("si")) {

			System.out.print(nombreInput + " ¿Usted que estudia?> ");
			String estudia = tecladoInput.nextLine().trim();

			System.out.print("El señor/a " + nombreInput + " Esta estudiando " + estudia);
		} else if(trabajaSiNo.equals("si") && estudiaSiNo.equals("no")) {
		
			System.out.print(nombreInput + " ¿De que trabajas?> ");
			String trabajo = tecladoInput.nextLine().trim();

			System.out.print("El señor/a " + nombreInput + " Esra trabajando de " + trabajo);
		} else if(trabajaSiNo.equals("no") && estudiaSiNo.equals("no")) {

			System.out.print("El señor/a " + nombreInput + " Es un nini es decir ni estudia ni trabaja");
		}
	}
}