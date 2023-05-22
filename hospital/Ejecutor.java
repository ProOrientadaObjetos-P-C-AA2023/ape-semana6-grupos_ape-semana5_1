package hospital;

import hospital.Ciudad;
import hospital.Enfermero;
import hospital.EntidadHospitalaria;
import hospital.Medico;
import java.util.Scanner;

public class Ejecutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del hospital:");
        String nombreHospital = scanner.nextLine();
        
        System.out.println("Ingrese la dirección del hospital:");
        String direccionHospital = scanner.nextLine();
        
        System.out.println("Ingrese el nombre de la ciudad:");
        String nombreCiudad = scanner.nextLine();
        
        System.out.println("Ingrese la provincia de la ciudad:");
        String provinciaCiudad = scanner.nextLine();
        
        System.out.println("Ingrese el número de especialidades:");
        int numeroEspecialidades = scanner.nextInt();
        
        // Crear objeto Ciudad
        Ciudad ciudad = new Ciudad(nombreCiudad, provinciaCiudad);
        
        System.out.println("Ingrese la cantidad de médicos:");
        int cantidadMedicos = scanner.nextInt();
        
        // Crear array de médicos
        Medico[] medicos = new Medico[cantidadMedicos];
        for (int i = 0; i < cantidadMedicos; i++) {
            scanner.nextLine(); // Limpiar el buffer
            System.out.println("Ingrese el nombre del médico " + (i + 1) + ":");
            String nombreMedico = scanner.nextLine();
            
            System.out.println("Ingrese la especialidad del médico " + (i + 1) + ":");
            String especialidadMedico = scanner.nextLine();
            
            System.out.println("Ingrese el sueldo mensual del médico " + (i + 1) + ":");
            double sueldoMedico = scanner.nextDouble();
            
            medicos[i] = new Medico(nombreMedico, especialidadMedico, sueldoMedico);
        }
        
        System.out.println("Ingrese la cantidad de enfermeros(as):");
        int cantidadEnfermeros = scanner.nextInt();
        
        // Crear array de enfermeros
        Enfermero[] enfermeros = new Enfermero[cantidadEnfermeros];
        for (int i = 0; i < cantidadEnfermeros; i++) {
            scanner.nextLine(); // Limpiar el buffer
            System.out.println("Ingrese el nombre del enfermero(a) " + (i + 1) + ":");
            String nombreEnfermero = scanner.nextLine();
            
            System.out.println("Ingrese el tipo del enfermero(a) " + (i + 1) + " (nombramiento/contrato):");
            String tipoEnfermero = scanner.nextLine();
            
            System.out.println("Ingrese el sueldo mensual del enfermero(a) " + (i + 1) + ":");
            double sueldoEnfermero = scanner.nextDouble();
            
            enfermeros[i] = new Enfermero(nombreEnfermero, tipoEnfermero, sueldoEnfermero);
        }
        
        // Crear objeto EntidadHospitalaria
        EntidadHospitalaria hospital = new EntidadHospitalaria(nombreHospital, ciudad, numeroEspecialidades, medicos, enfermeros, direccionHospital);
        
        // Imprimir el objeto hospital
        System.out.println(hospital.toString());
        
        scanner.close();
    }
}

