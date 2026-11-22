class EjemploExcepcion {
    public static void main(String[] args) {
        String numero = "a";
        try {
            int n = Integer.parseInt(numero);
            System.out.print(n);
        } catch (NumberFormatException e) {
            System.out.println("La entrada no es un numero");
            e.printStackTrace();
        }
    }
}