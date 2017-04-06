/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoria;

/**
 *
 * @author Severa
 */
public class factorialN {
    private int n;
    
    public factorialN() {
    
    }

    public factorialN(int n) {
        this.n = n;
    }
    



    public void asignarValor(int num){
        n=num;
    }
    public int obtenerFac(){
        int valorfactorial=1;
        int aux=n;
        while (n>=1){
            valorfactorial=valorfactorial*n;
            n=n-1;
        }
        n=aux;
        return valorfactorial ;
    }
}
