package Cinema;
//@author Andres Marulanda
import java.util.Calendar;

public class Silla implements ICobro {
    
    protected int no;
    protected String imagen;
    protected Estado estado;

    public Silla(int no, String imagen, Estado estado) {
        this.no = no;
        this.imagen = imagen;
        this.estado = estado;
    }

    public int getNo() {
        return no;
    }

    public String getImagen() {
        return imagen;
    }

    public Estado getEstado() {
        return estado;
    }
    
    public void cambiarEstado(Estado estado){
        this.estado = estado;
    }
    
    @Override
    public double calcularPrecio(int dia) {
        if (dia >= Calendar.MONDAY && dia <= Calendar.FRIDAY){
           return 5000; 
        }
        return 7000;
    }

    @Override
    public String toString() {
        return "Silla #" + this.no;
    }
    
    
}
