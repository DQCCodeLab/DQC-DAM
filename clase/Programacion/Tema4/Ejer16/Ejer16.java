import java.util.Scanner;

class Ejer16 {
	public static void main(String args[]) {

		Scanner tecladoInput = new Scanner(System.in);

		while(true) {

			System.out.print("\n1 ---- Honda\n2 ---- Yamaha\n3 ---- Suzuki\n4 ---- Otra\n5 ---- Salir\n");
			
			System.out.print("Selecione el modelo que va a comprar> ");
			int opcion = Integer.parseInt(tecladoInput.nextLine().trim());
			
			if(opcion == 5) {

				System.out.print("Hasta Luego");
				break;
			}
			
			switch(opcion) {

				case 1:
					System.out.print("Cuanto vale el modelo Honda> ");
					double costeModeloH = Double.parseDouble(tecladoInput.nextLine().trim());
					
					System.out.print("Al ser Honda tienes una promocion de un 5% de descuento. el precio final se te queda en " + (costeModeloH - (costeModeloH * 0.05)));
					break;
				
				case 2:
					System.out.print("Cuanto vale el modelo Yamaha> ");
					double costeModeloY = Double.parseDouble(tecladoInput.nextLine().trim());
					
					System.out.print("Al ser Yamaha tienes una promocion de un 8% de descuento. el precio final se te queda en " + (costeModeloY - (costeModeloY * 0.08)));
					break;

				case 3:
					System.out.print("Cuanto vale el modelo Suzuki> ");
					double costeModeloS = Double.parseDouble(tecladoInput.nextLine().trim());
					
					System.out.print("Al ser Suzuki tienes una promocion de un 10% de descuento. el precio final se te queda en " + (costeModeloS - (costeModeloS * 0.10)));
					break;
			
				case 4:
					System.out.print("Cuanto vale el modelo otros> ");
					double costeModeloO = Double.parseDouble(tecladoInput.nextLine().trim());
					
					System.out.print("Al ser otros tienes una promocion de un 2% de descuento. el precio final se te queda en " + (costeModeloO - (costeModeloO * 0.02)));
					break;
			}
		}
	}
}