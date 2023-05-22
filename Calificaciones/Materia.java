/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.Calificaciones;

class Materia {
    private String nombre;
    private double acd;
    private double ape;
    private double aa;

    public Materia(String nombre, double acd, double ape, double aa) {
        this.nombre = nombre;
        this.acd = acd;
        this.ape = ape;
        this.aa = aa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAcd() {
        return acd;
    }

    public void setAcd(double acd) {
        this.acd = acd;
    }

    public double getApe() {
        return ape;
    }

    public void setApe(double ape) {
        this.ape = ape;
    }

    public double getAa() {
        return aa;
    }

    public void setAa(double aa) {
        this.aa = aa;
    }

    public boolean haAprobado() {
        double sumatoria = acd + ape + aa;
        if (sumatoria >= 7) {
            return true;
        } else if (sumatoria >= 6) {
            // Supletorio
            return false;
        } else {
            // Examen de convalidación
            double notaConvalidacion = (7 - sumatoria) + (sumatoria * 0.6);
            return notaConvalidacion >= 3.5;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre de la materia: ").append(nombre).append("\n");
        sb.append("ACD: ").append(acd).append("\n");
        sb.append("APE: ").append(ape).append("\n");
        sb.append("AA: ").append(aa).append("\n");
        sb.append("Estado de aprobación: ").append(haAprobado() ? "Aprobado" : "Reprobado").append("\n");
        return sb.toString();
    }
}
