/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastel_cumpleaños;

/**
 *
 * @author crist
 */
public class velas 
{
    
    private int valorvelas;

    public velas(int valorvelas) {
        this.valorvelas = valorvelas;
    }

    public int getValorvelas() {
        return valorvelas;
    }

    
    public String mostrar() {
        return "valor mayor de las velas: "+valorvelas+"\n";
    }
    
    
}
