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
public class Cacao extends Ingrediente{
    
    private String tipo;
    private String cantidad;
    
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getCantidad() {
        return cantidad;
    }
    public void setTama(String cantidad) {
        this.cantidad = cantidad;
    }
    
    public String EscogerTama()
    {
        return "El metodo Escoger Tamaño no está implementado";
    }

}
