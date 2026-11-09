class PracticaVariables {
	public static void main(String args[]) {
	
		int n1 = 5;
		// Se crea la variable n1 y se le asigna el valor 5 de tipo de dato entero (int)

		System.out.println("El valor de la variabele n1 es de: " + n1);

		double n2 = 10.99;
		// Se crea la variable n2 y se le asigna el valor 10.99 de tipo de dato real (double/float)

		System.out.println("El valor de la variabele n2 es de: " + n2);

		String nombre = "David";
		// Se crea la variable nombre y se le asigna el valor David de tipo de dato cadena de texto (String)


		System.out.println("Mi nombre es " + nombre);

		boolean c1 = true;
		// Se crea la variable c1 y se le asigna el valor True de tipo de boleano (boolean)

		
		System.out.println("La variable c1 tiene el valor de " + c1);
		
		// Operadores logicos

		/*
		operador + Suma
		operador - Resta
		operador * Multiplicacion
		operador / Division
		operador % Resto de la division (Modulo)
		operador ++ Incremento en 1
		operador -- Decremento en 1
		*/

		System.out.print("\nLa suma de 5 + 5 es " + (5 + 5) + "\nLa division de 10 entre 2 da " + (10 / 2) + "\nEl modulo de 10 entre 2 es de " + (10 % 2));

		int contador;
		contador = 0;
		System.out.print("\nEl valor del contador es de " + contador);

		
		contador ++;
		System.out.print("\nEl valor del contador incrementado es de " + contador);
		// Incrementamos el contador

		contador --;
		System.out.print("\nEl valor del contador decrementado es de " + contador + "\n");
		// Decrementamos el contador
		
		int x = 5;
		int y = 9;
		double division = (double)x / (double)y;
		//double division = x / y;
		System.out.print(division);

	}
}