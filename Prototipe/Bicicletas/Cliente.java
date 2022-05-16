package Prototipe.Bicicletas;

public class Cliente {
    public static void main(String[] args) {
        
        try {
            Bicicleta bc = new BicicletaModificada();
            bc.setColor("Roja");
            bc.setMarca("Bacini");
            Bicicleta bc2 = bc.clone();
            bc2.setColor("Negra");
            bc2.setMarca("Bacini");

            System.out.println(bc.verBicicleta());
            System.out.println(bc2.verBicicleta());
            System.out.println(bc.verBicicleta());
        } catch (Exception e) {
            System.out.println("Error de clonación");
        }
    }
}
