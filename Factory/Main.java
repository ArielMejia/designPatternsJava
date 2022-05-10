package Factory;

public class Main {
    public static void main(String[] args) {
        Factura f = FactoriaFacturas.getFactura("iva");
        f.setId(1);
        f.setImporte(100);
        System.out.println("Total es: " + f.getImporteIva());
    }
}
