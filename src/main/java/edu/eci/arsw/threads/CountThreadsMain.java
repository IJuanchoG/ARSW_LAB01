/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThreadsMain {
    private static Thread A,B,C;
    public static void main(String a[]){
        A = new Thread(new CountThread(0,99));
        B = new Thread(new CountThread(99,199));
        C = new Thread(new CountThread(200,299));
        start();
    }
    
    /**
     * inicia los hilos por el método de Start
     */
    public static void start(){
        A.start();
        B.start();
        C.start();
    }
    
    /**
     * Inicia los hilos por el método de Run
     */
    public static void run(){
        A.run();
        B.run();
        C.run();
    }
}

