package Cinema;
//@author Andres Marulanda

import java.util.Date;
import java.text.SimpleDateFormat;

public class Venta {
    
    private Date fecha;
    private double valorVenta;
    private Silla silla;
    private Cliente cliente;

    public Venta(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(double valorVenta) {
        this.valorVenta = valorVenta;
    }

    public Silla getSilla() {
        return silla;
    }

    public void setSilla(Silla silla) {
        this.silla = silla;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Object[] getDatosComoFila() {
        String fechaFormateada = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(this.fecha);
        Object[] fila = {fechaFormateada, this.cliente.getNombre(), this.silla, this.valorVenta};
        return fila;
    }
}
