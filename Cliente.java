package Cinema;
//@author Andres Marulanda

public class Cliente {
    
    private String nombre;
    private String documento;

    public Cliente(String nombre, String documento) {
        this.nombre = nombre;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }
    
    
    
}
