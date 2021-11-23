/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

/**
 *
 * @author user
 */
public class Ingrediente extends MaquinaCafe{
    
    private String nombre;	
    private String cant;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getcant() {
        return cant;
    }
    public void setCant(String cant) {
        this.cant = cant;
    }
    
    public String Elegiringrediente()
    {
        return "El metodo Elegir ingrediente no está implementado";
    }

    
}
