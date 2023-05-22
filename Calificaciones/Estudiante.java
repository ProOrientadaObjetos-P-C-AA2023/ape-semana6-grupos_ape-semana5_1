package hospital.Calificaciones;
import java.util.ArrayList;
import java.util.List;

class Estudiante {
    private String nombre;
    private int edad;
    private List<Materia> materias;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.materias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void agregarMateria(Materia materia) {
        materias.add(materia);
    }

    public boolean haAprobadoMateria(String nombreMateria) {
        for (Materia materia : materias) {
            if (materia.getNombre().equals(nombreMateria)) {
                return materia.haAprobado();
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre del estudiante: ").append(nombre).append("\n");
        sb.append("Edad: ").append(edad).append("\n");
        sb.append("Materias inscritas:\n");
        for (Materia materia : materias) {
            sb.append(materia.toString()).append("\n");
        }
        return sb.toString();
    }
}

