
package com.mycompany.actividad2.sg;

import java.security.SecureRandom;

public class Ventas {
    private static final int TAMANIO = 90_000;
    
    SecureRandom sr = new SecureRandom();
    
    int [] A = new int[TAMANIO]; //productos
    int [] B = new int[TAMANIO]; //pedidos
    int [] C = new int[TAMANIO]; //compra
    
    public void llenarA() {
        for ( int i = 0; i < TAMANIO; i ++) {
            A[i] = sr.nextInt();
            System.out.println("Llenar A: " + i);
        }
    }
    
    public void llenarB() {
        for ( int i = 0; i < TAMANIO; i ++) {
            B[i] = sr.nextInt();
            System.out.println("LLenar B: " + i);
        }
    }
    
    public void llenarC() {
        for ( int i = 0; i < TAMANIO; i ++) {
            int val = 0;
            if (A[i] == B[i]) {
                val = A[i];
            }else if (B[i] > A[i]) {
                val = 2 * (B[i] - A[i]);
            } else {
                val = B[i];
            }
            C[i] = val;
            System.out.println("Llenar C: " + i);
        } 
    }
}
