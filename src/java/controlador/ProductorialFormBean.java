/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import productoria.productoriaN;

/**
 *
 * @author Severa
 */
@ManagedBean
@RequestScoped
public class ProductorialFormBean {
private int num;

    /**
     * Creates a new instance of ProductriaFormBean
     */
    public ProductorialFormBean() {
    }
    public int calcularProductorial(){
productoriaN unProductorial=new productoriaN();
unProductorial.asignarValor(num);
return unProductorial.obtenerProd();


}

    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }
}
