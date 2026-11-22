import java.util.Scanner;

class Ejer9 {
    public static void main(String args[]) {

        Scanner tecladoInput = new Scanner(System.in);

        System.out.print("Cuantos puntos quieres registrar> ");
        int nPuntos = Integer.parseInt(tecladoInput.nextLine().trim());

        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int centroC0 = 0;

        for(int i = 0; i < nPuntos; i++) {
        System.out.print("Usuario porfavor introduzca en numero entero la cordenada x> ");
        int x = Integer.parseInt(tecladoInput.nextLine().trim());

        System.out.print("Usuario porfavor introduzca en numero entero la cordenada y> ");
        int y = Integer.parseInt(tecladoInput.nextLine().trim());

            if(x > 0 && y > 0) c1 ++;
            else if(x > 0 && y < 0) c4++;
            else if(x < 0 && y > 0) c2 ++;
            else if (x < 0 && y < 0) c3 ++;  
            else if(x == 0 && y == 0) centroC0 ++;
        }
        System.out.print(
            "Tienes " + c1 + " puntos en el cuadrante 1\n" +
            "Tienes " + c2 + " puntos en el cuadrante 2\n" +
            "Tienes " + c3 + " puntos en el cuadrante 3\n" +
            "Tienes " + c4 + " puntos en el cuadrante 4\n" +
            "Tienes " + centroC0 + " puntos en el centro\n"
        );
    }
}
