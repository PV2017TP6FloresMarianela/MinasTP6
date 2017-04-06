/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productoria;

/**
 *
 * @author Severa
 */
public class productoriaN {
    private int dato;

    public productoriaN() {
    }

    public productoriaN(int dato) {
        this.dato = dato;
    }
    
   



    public void asignarValor(int num){
        dato=num;
    }
    public int obtenerProd(){
        int valorProductorial=1;
        int aux=dato;
        while (dato>=1){
            valorProductorial=valorProductorial*dato;
            dato=dato-1;
        }
        dato=aux;
        return valorProductorial ;
    }
}
