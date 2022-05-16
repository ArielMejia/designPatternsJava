package Prototipe.Bicicletas;

public abstract class Bicicleta implements Cloneable{
    
    private String color;
    private String marca;
    
    /**
     * Metodo clonador
     */
    public Bicicleta clone() throws CloneNotSupportedException{
        return (Bicicleta) super.clone();
    }

    public abstract String verBicicleta();

    //Getters abd Setters
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
}
