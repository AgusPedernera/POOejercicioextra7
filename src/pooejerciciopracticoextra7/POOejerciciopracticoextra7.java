/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerciciopracticoextra7;

import entidad.Rectangulo;

/**
 *
 * @author tinap
 */
public class POOejerciciopracticoextra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo();
        Rectangulo rectangulo2 = new Rectangulo();
        rectangulo1.setLado1(4);
        rectangulo1.setLado2(6);
        rectangulo1.calcular_area();
        rectangulo2.calcular_area();
    }
    
}
