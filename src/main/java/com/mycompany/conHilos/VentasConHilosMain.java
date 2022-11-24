
package com.mycompany.conHilos;


public class VentasConHilosMain {
    
    public static void main(String[] args) {
        
        VentasConHilos vc = new VentasConHilos();
        long inicio = System.currentTimeMillis();
        vc.start();
        vc.llenarB();
        vc.llenarC();
        long fin = System.currentTimeMillis();
        long total = fin - inicio;

        System.out.println("Tardó: " + total + " ms");
    } 
}
