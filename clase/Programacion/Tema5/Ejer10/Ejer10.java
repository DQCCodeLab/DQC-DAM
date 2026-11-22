import java.util.Scanner;

class Ejer10{
    public static void main(String args[]){

        Scanner tecladoInput = new Scanner(System.in);

        System.out.print("Cuantos triangulos quieres registrar> ");
        int nTriangulos = Integer.parseInt(tecladoInput.nextLine().trim());

        System.out.print(
            "Estas seguro que quieres registrar " + nTriangulos + 
            "\n(S/N) responda S si es si y N si es no> "
        );
        String confirmacionSN = tecladoInput.nextLine().trim().toLowerCase();
        
        int confirmacion = (confirmacionSN.equals("s")) ? 1 : 0;
        int nEquilatero = 0 , nIsoceles = 0 , nEscaleno = 0;
        int numEqui = 0 , numIso = 0 , numEsca = 0;
        switch (confirmacion) {
            case 0:
                System.out.print("Como tu confirmacion a sido negativa se detendra el programa");
                break;
            case 1: 
                for(int i = 0; i < nTriangulos; i++) {
                    System.out.print(
                        "Porfavor introduzca el lado 1 del triangulo " + i + "> "
                    );
                    int l1 = Integer.parseInt(tecladoInput.nextLine().trim());

                    System.out.print(
                        "Porfavor introduzca el lado 2 del triangulo " + i + "> "
                    );
                    int l2 = Integer.parseInt(tecladoInput.nextLine().trim());

                    System.out.print(
                        "Porfavor introduzca el lado 3 del triangulo " + i + "> "
                    );
                    int l3 = Integer.parseInt(tecladoInput.nextLine().trim());

                    if(l1 == l2 && l1 == l3) {
                        nEquilatero ++;
                        numEqui ++;
                        System.out.println("Es un triangulo equilatero y es el numero " + numEqui);
                    }else if(l1 == l2 || l1 == l3 || l2 == l3) {
                        nIsoceles ++;
                        numIso ++;
                        System.out.println("Es un Isoceles y es el numero " + numIso);
                    }else if(l1 != l2 && l1 != l3 && l2 != l3){
                        nEscaleno ++;
                        numEsca ++;
                        System.out.println("Es un triangulo Escaleno y es el numero" + numEsca);
                    }
                }
                break;
         }
    System.out.print(
        "Los triangulos registrados son los siguientes" +
        "\nEquilateros: " + nEquilatero +
        "\nIsoceles: " + nIsoceles +
        "\nEscaleno: " + nEscaleno +
        "\nCon un total de " + nTriangulos + " triangulos registrados"
    );
    }
}