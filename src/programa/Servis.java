/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import Perro.Perro;
import Persona.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nico
 */
public class Servis { 
    
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    List <Perro> ListasDePerros=new ArrayList();
    List <Persona> ListasDePersonas=new ArrayList();
    
    public void persona(){ 

        for (int i = 0; i < 2; i++) {
        Persona p1=new Persona();     
        System.out.println("ingrese su nombre");
        p1.setNombre(leer.next());
        System.out.println("ingrese su apellido");
        p1.setApellido(leer.next());
        System.out.println("ingrese su edad");
        p1.setEdad(leer.nextInt());
        System.out.println("ingrese su DNI");
        p1.setDni(leer.next());
        
        ListasDePersonas.add(p1);
                 
        }
        
    }
    public void perro(){
        
        for (int i = 0; i < 2; i++) {
            Perro m1=new Perro();
            System.out.println("ingrese el nombre de su perro");
            m1.setNombre(leer.next());
            System.out.println("ingrese la edad de su mascota");
            m1.setEdad(leer.nextInt());
            System.out.println("ingrese la raza de su mascota");
            m1.setRaza(leer.next());
            System.out.println("ingrese el tamaño de su mascota");
            m1.setTamaño(leer.next());
            
            ListasDePerros.add(m1);
            
        }
        
    }
    
    public void retorno(){
        int i=0;
        for (Perro aux : ListasDePerros) {
            ListasDePersonas.get(i).setPerro(aux);            
        i++;
        }
    }
    public void listadepersonas(){
        System.out.println(ListasDePersonas.toString());
        for (Persona aux : ListasDePersonas) {
            System.out.println(aux.toString());
        }
    }
    
}
    
