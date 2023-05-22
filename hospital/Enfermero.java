package hospital;

public class Enfermero {
    private String nombre;
    private String tipo;
    private double sueldoMensual;
    
    public Enfermero(String nombre, String tipo, double sueldoMensual) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.sueldoMensual = sueldoMensual;
    }
    
    // Setters y getters
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public double getSueldoMensual() {
        return sueldoMensual;
    }
    
    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
    
    @Override
    public String toString() {
        return "- " + nombre + " - sueldo: " + sueldoMensual + " - " + tipo;
    }
}

