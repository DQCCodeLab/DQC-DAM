class Ejer4 {
	public static void main(String args[]) {

		int centimosEuros = 1500;
		double auxCentimosConversorEuros = (double)centimosEuros / 100;
		double euros = auxCentimosConversorEuros;
		int auxCentPesetas = centimosEuros * 166;
		int pesetas = auxCentPesetas;
		
		System.out.print("Tienes " + euros + " Euros que son " + pesetas + " Pesetas");

	}
}