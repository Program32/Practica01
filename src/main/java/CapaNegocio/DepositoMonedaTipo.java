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
public class DepositoMonedaTipo extends DepositoMonedas{
    
        private String denominacion;

    public String getDenominacion() {
        return denominacion;
    }
    public void setDnominacion(String Dnominacion) {
        this.denominacion = denominacion;
    }
       public String VerificarMoneda()
    {
        return "El verificar moneda no esta implementado";
    }
   public String DevolverMoneda()
    {
        return "El Devolver Moneda  no esta implementado";
    }

}
