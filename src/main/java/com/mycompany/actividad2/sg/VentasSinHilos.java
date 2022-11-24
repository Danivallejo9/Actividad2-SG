
package com.mycompany.actividad2.sg;

public class VentasSinHilos {

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        Ventas v = new Ventas();
        v.llenarA();
        v.llenarB();
        v.llenarC();
        long fin = System.currentTimeMillis();
        long total = fin - inicio;
        System.out.println("Tardó: " + total + " ms");
    }
}
