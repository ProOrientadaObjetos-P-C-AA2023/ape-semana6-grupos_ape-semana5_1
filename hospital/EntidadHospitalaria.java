package hospital;

public class EntidadHospitalaria {
    private String nombre;
    private Ciudad ciudad;
    private int numeroEspecialidades;
    private Medico[] medicos;
    private Enfermero[] enfermeros;
    private double totalSueldos;
    private String direccion;
    
    public EntidadHospitalaria(String nombre, Ciudad ciudad, int numeroEspecialidades, Medico[] medicos, Enfermero[] enfermeros, String direccion) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.numeroEspecialidades = numeroEspecialidades;
        this.medicos = medicos;
        this.enfermeros = enfermeros;
        this.direccion = direccion;
        calcularTotalSueldos();
    }
    
    private void calcularTotalSueldos() {
        double sueldosMedicos = 0;
        for (Medico medico : medicos) {
            sueldosMedicos += medico.getSueldoMensual();
        }
        
        double sueldosEnfermeros = 0;
        for (Enfermero enfermero : enfermeros) {
            sueldosEnfermeros += enfermero.getSueldoMensual();
        }
        
        totalSueldos = sueldosMedicos + sueldosEnfermeros;
    }
    
    // Setters y getters
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Ciudad getCiudad() {
        return ciudad;
    }
    
    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    
    public int getNumeroEspecialidades() {
        return numeroEspecialidades;
    }
    
    public void setNumeroEspecialidades(int numeroEspecialidades) {
        this.numeroEspecialidades = numeroEspecialidades;
    }
    
    public Medico[] getMedicos() {
        return medicos;
    }
    
    public void setMedicos(Medico[] medicos) {
        this.medicos = medicos;
        calcularTotalSueldos();
    }
    
    public Enfermero[] getEnfermeros() {
        return enfermeros;
    }
    
    public void setEnfermeros(Enfermero[] enfermeros) {
        this.enfermeros = enfermeros;
        calcularTotalSueldos();
    }
    
    public double getTotalSueldos() {
        return totalSueldos;
    }
    
    public void setTotalSueldos(double totalSueldos) {
        this.totalSueldos = totalSueldos;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombre).append("\n");
        sb.append("Dirección: ").append(direccion).append("\n");
        sb.append(ciudad.toString()).append("\n");
        sb.append("Número de especialidades: ").append(numeroEspecialidades).append("\n");
        
        sb.append("Listado de médicos\n");
        for (Medico medico : medicos) {
            sb.append(medico.toString()).append("\n");
        }
        
        sb.append("Listado de enfermeros(as)\n");
        for (Enfermero enfermero : enfermeros) {
            sb.append(enfermero.toString()).append("\n");
        }
        
        sb.append("Total de sueldos a pagar por mes: ").append(totalSueldos);
        
        return sb.toString();
    }
}

