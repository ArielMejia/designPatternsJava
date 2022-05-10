package Singleton;
public class Main {

    public static void main(String[] args) {
        
        SoyUnico kevin = SoyUnico.getSingletonInstance("Kevin Mejia");
        
        try {
            SoyUnico pablo = kevin.clone();
            System.out.println(pablo.getNombre());
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
    }
}
