/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4.lidiacintadof;

/**
 *
 * @author bicho
 */
public class Pilotos {
    String nombre;
    String ape;
    int edad;

    public Pilotos(String nombre, String ape, int edad) {
        this.nombre = nombre;
        this.ape = ape;
        this.edad = edad;
    }

    public Pilotos() {
        this.nombre = "Lidia";
        this.ape = "Cintado";
        this.edad = 89;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Pilotos{" + "nombre=" + nombre + ", ape=" + ape + ", edad=" + edad + '}';
    }
    
    
    
    
}
