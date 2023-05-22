package hospital;

public class Ciudad {
    private String nombre;
    private String provincia;
    
    public Ciudad(String nombre, String provincia) {
        this.nombre = nombre;
        this.provincia = provincia;
    }
    
    // Setters y getters
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getProvincia() {
        return provincia;
    }
    
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    @Override
    public String toString() {
        return "Ciudad: " + nombre + "\nProvincia: " + provincia;
    }
}

