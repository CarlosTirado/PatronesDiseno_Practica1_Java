/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author LENOVO
 */
public class Cliente extends Persona {
    
    @Override
    public String ToString()
    {
        return "Identificación: " + Identificacion + " - Nombre: " + Nombre;
    }
    
}