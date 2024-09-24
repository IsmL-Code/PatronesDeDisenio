/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooaplicationcondo;

/**
 *
 * @author Ismael Condo
 */
public class Persona {
    
    private String cedula;
    private String nombre;
    private int anioNacimiento;

    public Persona(String cedula, String nombre, int anioNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
    }

    // Método para calcular la edad actual
    public int obtieneEdad(int anioActual) {
        return anioActual - this.anioNacimiento;
    }

    // Método para validar la cédula 
    public boolean esCedulaValida() {
        return cedula != null && cedula.length() == 10; 
    }

    // Getters y Setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }
    
}
