package Factory;

public class FacturaIVA extends Factura{

    @Override
    public double getImporteIva(){
        return getImporte() * 1.12;
    }
}