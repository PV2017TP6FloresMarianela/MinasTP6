/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import factoria.factorialN;

/**
 *
 * @author Severa
 */
public class principal {
    public static void main (String[]mary){
        mostrarFactorial();
    }
        public static void mostrarFactorial () {
            factorialN fac=new factorialN();
            fac.asignarValor(7);
            int res=fac.obtenerFac();
            System.out.println("el factorial es: "+res);;
        }
}
