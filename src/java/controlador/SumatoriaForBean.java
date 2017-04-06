/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import sumatoria.sumatoriaN;

/**
 *
 * @author Severa
 */
@ManagedBean
@RequestScoped
public class SumatoriaForBean {
    private int numero;
    /**
     * Creates a new instance of SumatoriaForBean
     */
    public SumatoriaForBean() {
    }
    public int calcularSumatoria(){
        sumatoriaN unSumatorial=new sumatoriaN();
        unSumatorial.asignarValor(numero);
return unSumatorial.obtenerSumatoria();
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
}
