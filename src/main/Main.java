/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package main;

import Persona.Persona;
import java.util.ArrayList;
import java.util.List;
import programa.Servis;

/**
 *
 * @author nico
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servis s1=new Servis();
        
        
        s1.persona();
        s1.perro();
        s1.retorno();
        s1.listadepersonas();     
    }
    
}
