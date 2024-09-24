/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooaplicationcondo;

/**
 *
 *  * @author Ismael Condo

 */
public class Empleado extends Persona {
    private double sueldo;

    public Empleado(String cedula, String nombre, int anioNacimiento, double sueldo) {
        super(cedula, nombre, anioNacimiento);
        this.sueldo = sueldo;
    }

    // Getter y Setter para sueldo
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}

