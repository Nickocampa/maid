/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perro;

/**
 *
 * @author nico
 */
public class Perro {
    private String nombre;
    private String tamaño;
    private Integer edad;
    private String raza;

    public Perro() {
    }

    public Perro(String nombre, String tamaño, Integer edad, String raza) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", tama\u00f1o=" + tamaño + ", edad=" + edad + ", raza=" + raza + '}';
    }
    
    
    
    
    
    
}
