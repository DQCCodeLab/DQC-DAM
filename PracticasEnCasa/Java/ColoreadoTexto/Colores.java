class Colores {
	public static void main(String arg[]) {

		String rojo = "\033[31m";
		String verde = "\033[32m";
		String reset = "\033[0m";

		System.out.print(rojo + "Texto de color rojo" + verde + " Texto de color verde" + reset);
		
	}
}