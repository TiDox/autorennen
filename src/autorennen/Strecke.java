/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autorennen;

/**
 *
 * @author bbsuser
 */
public class Strecke {
    
    private double anfangStrecke;
    
    private double endeStrecke;
    
    private double currentPosition;

    public double getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(double currentPosition) {
        this.currentPosition = currentPosition;
    }
 
}