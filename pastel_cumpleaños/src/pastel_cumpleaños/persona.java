/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastel_cumpleaños;


public class persona 
{
    
    private String nombre;
    private int edad;  
    
    //constructor
    public persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
    
     public String mostrardatos() {
        return "nombre: "+nombre+"\nedad: "+edad+"\n";
    }
    
      
    
    
    
    
}
