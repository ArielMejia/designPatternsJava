package Factory;

public class Main {
    public static void main(String[] args) {
        Factura f = FactoriaFacturas.getFactura("iva");
        f.setId(1);
        f.setImporte(100);
        System.out.println("Total es: " + f.getImporteIva());

        Factura g = FactoriaFacturas.getFactura("ivareducido");
        g.setId(2);
        g.setImporte(100);
        System.out.println("Total es: " + g.getImporteIva());
    }
}
