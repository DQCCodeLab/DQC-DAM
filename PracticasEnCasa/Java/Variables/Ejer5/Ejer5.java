class Ejer5 {
	public static void main(String args[]) {

		int pesetas = 1500;
		int auxPestEuros = pesetas / 166;
		double euros = auxPestEuros;
		int auxEurosCent = (int)euros * 100;
		int centimosEuros = auxEurosCent;

		

		
		System.out.print("Tienes " + pesetas + " Pesetas que son " + euros + " Euros");

	}
}