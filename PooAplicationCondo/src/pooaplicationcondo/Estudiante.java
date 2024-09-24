/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooaplicationcondo;

/**
 *
 *  * @author Ismael Condo

 */
public class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String cedula, String nombre, int anioNacimiento, String carrera) {
        super(cedula, nombre, anioNacimiento);
        this.carrera = carrera;
    }

    // Getter y Setter para carrera
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
 
