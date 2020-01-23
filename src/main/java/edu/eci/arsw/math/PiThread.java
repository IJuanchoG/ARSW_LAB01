/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.math;

/**
 *
 * @author juan.garcia-ga
 */
public class PiThread extends Thread{
    int numHilo,A,B;
    byte[] digitos;

    
    public PiThread(int A, int B, int C){
        super("PiThread");
        this.numHilo = C;
        this.A = A;
        this.B = B;
    }
    
    @Override
    public void run(){
        digitos = PiDigits.getDigits(A, B); 
    }
    
    
    public int getNumHilo() {
        return numHilo;
    }

    public void setNumHilo(int numHilo) {
        this.numHilo = numHilo;
    }    
    
    public byte[] getDigitos() {
        return digitos;
    }

    public void setDigitos(byte[] digitos) {
        this.digitos = digitos;
    }

}
