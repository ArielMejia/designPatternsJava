package Factory;

public class FacturaIVAReducido extends Factura {
    
    @Override
    public double getImporteIva(){
        return getImporte() * 1.12;
    }
}
