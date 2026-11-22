import java.util.Scanner;

class Ejer5{
    public static void main(String[] args) {
        Scanner tecladoInput = new Scanner(System.in);

        System.out.print("Cuantos empleados tienes> ");
        int nempleados = Integer.parseInt(tecladoInput.nextLine().trim());
        int nempleado = 1;
        int masDe500 = 0 , menosDe500 = 0;
        for(int i = 0; i < nempleados; i++) {
            System.out.print("Cuanto cobra tu empleado "  + nempleado + "> ");
            Double sueldo = Double.parseDouble(tecladoInput.nextLine().trim());
            nempleado ++;
            if(sueldo > 500.0) {
                masDe500++;
            } else {
                menosDe500++;
            }
        }
        System.out.print(masDe500 + " Son los empleados que ganan mas de 500€\n" + menosDe500 + " Son los empleados que ganan menos de 500€");
    }
}