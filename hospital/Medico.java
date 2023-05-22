package hospital;

public class Medico {
    private String nombre;
    private String especialidad;
    private double sueldoMensual;
    
    public Medico(String nombre, String especialidad, double sueldoMensual) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.sueldoMensual = sueldoMensual;
    }
    
    // Setters y getters
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }
    
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public double getSueldoMensual() {
        return sueldoMensual;
    }
    
    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
    
    @Override
    public String toString() {
        return "- " + nombre + " - sueldo: " + sueldoMensual + " - " + especialidad;
    }
}


