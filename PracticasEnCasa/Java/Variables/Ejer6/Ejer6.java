class Ejer6 {
	public static void main(String args[]) {

		final double IVA = 0.21;

		double factura = 100;
		double auxIva = factura * IVA;
		System.out.print("Factura sin iva: " + factura + "\nFactura con IVA: " + (auxIva + factura));

	}
}
