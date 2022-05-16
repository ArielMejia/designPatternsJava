package Prototipe.Bicicletas;

public class BicicletaModificada extends Bicicleta{
    
    @Override
    public String verBicicleta(){
        return "Este es el color: " + this.getColor() + " La marca es: " + this.getMarca();
    }
}
