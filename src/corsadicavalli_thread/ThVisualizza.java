/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsadicavalli_thread;

import java.io.IOException;

/**
 *
 * @author saccani_federico
 */
public class ThVisualizza extends Thread{
    
    private VariabiliCondivise ptrVariabili;
    
    public ThVisualizza(VariabiliCondivise ptrVariabili){
        this.ptrVariabili=ptrVariabili;
    }
            
            
    @Override
    public void run(){
        //visualizzo il vettore schermo
        boolean continua=true;
        int i=0;
        
        while(ptrVariabili.getContinua()){
            i=0;
            Schermo schermo = ptrVariabili.getSchermo();
                
            while(i<schermo.getNumEl() && continua==true){

                System.out.println(schermo.getPos(i));
                
                if(Thread.currentThread().isInterrupted()){
                    continua=false;
                }
                i++;
            }      
            
        }
    }        
}
