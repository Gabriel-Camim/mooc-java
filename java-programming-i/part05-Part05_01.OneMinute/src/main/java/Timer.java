/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lil Camin's
 */
public class Timer {
    private ClockHand mili;
    private ClockHand sec;
    private ClockHand min;
    private ClockHand hour;
            
    public Timer () {
        this.hour = new ClockHand(24);
        this.min = new ClockHand(60);
        this.sec = new ClockHand(60);
        this.mili = new ClockHand(100);
    }
    public String toString(){
        return sec + ":" + mili;
    }
    public void advance(){
        this.mili.advance();
        
        if(this.mili.value() == 0){
            this.sec.advance();
            
            if(this.sec.value() == 0){
                this.min.advance();
                
                if(this.min.value() == 0){
                    this.hour.advance();
                }
            }
        }
    }
}
