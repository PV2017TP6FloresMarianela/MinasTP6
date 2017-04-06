/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import factoria.factorialN;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Severa
 */
@ManagedBean
@SessionScoped
public class FactorialFormBin {
private int n;

    /**
     * Creates a new instance of FactorialFormBin
     */
    public FactorialFormBin() {
    }
public int calcularFactorial(){
factorialN unFactorial=new factorialN();
unFactorial.asignarValor(n);
return unFactorial.obtenerFac();


}
    /**
     * @return the n
     */
    public int getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(int n) {
        this.n = n;
    }
    
}
