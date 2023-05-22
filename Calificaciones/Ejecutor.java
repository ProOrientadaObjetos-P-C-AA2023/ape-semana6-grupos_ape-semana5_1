/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.Calificaciones;

public class Ejecutor {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan Perez", 20);

        Materia materia1 = new Materia("Matemáticas", 8, 7, 6);
        Materia materia2 = new Materia("Física", 7, 6, 5);
        Materia materia3 = new Materia("Química", 6, 5, 4);

        estudiante.agregarMateria(materia1);
        estudiante.agregarMateria(materia2);
        estudiante.agregarMateria(materia3);

        System.out.println(estudiante.toString());
    }
}
