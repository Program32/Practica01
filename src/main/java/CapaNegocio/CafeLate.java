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
public class CafeLate extends Producto{
    
    private String tamano;

    public String getTamano() {
        return tamano;
    }
    public void setTamano(String cantidad) {
        this.tamano = cantidad;
    }
    
    public String EscogerTamano()
    {
        return "El metodo Escoger Tamaño no está implementado";
    }

    
}
