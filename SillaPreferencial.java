package Cinema;
//@author Andres Marulanda

public class SillaPreferencial extends Silla {
    
    public SillaPreferencial(int no, String imagen, Estado estado) {
        super(no, imagen, estado);
    }

    @Override
    public double calcularPrecio(int dia) {
        double precio = super.calcularPrecio(dia); //Calculo el precio de la silla usando el método de la clase padre.
        return precio * 1.5; //Incremento en un 50%.
    }
    
    
}
