package Cinema;
//@author Andres Marulanda

public class SillaDeshabilitada extends Silla {
    
    public SillaDeshabilitada(int no, String imagen, Estado estado) {
        super(no, imagen, estado);
    }

    @Override
    public double calcularPrecio(int dia) {
        return -1; //El precio siempre será -1.
    }
    
    
    
    
}
