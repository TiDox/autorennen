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
public class Auto {
    
    private String spielerName;
    
    private double geschwindigkeit;
    
    private double beschleunigung;
    
    private int zeitInSekunden;
    
    private double tankfuellung;
    
    private double tankkapazität;

    public Auto(String spielerName) {
        this.spielerName = spielerName;
    }
    
    public void beschleunigung() {
        
    }
    
    public void bremsen() {
        
    }

    public double getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(double geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public double getBeschleunigung() {
        return beschleunigung;
    }

    public void setBeschleunigung(double beschleunigung) {
        this.beschleunigung = beschleunigung;
    }

    public int getZeitInSekunden() {
        return zeitInSekunden;
    }

    public void setZeitInSekunden(int zeitInSekunden) {
        this.zeitInSekunden = zeitInSekunden;
    }

    public double getTankfuellung() {
        return tankfuellung;
    }

    public void setTankfuellung(double tankfuellung) {
        this.tankfuellung = tankfuellung;
    }

    public double getTankkapazität() {
        return tankkapazität;
    }

    public void setTankkapazität(double tankkapazität) {
        this.tankkapazität = tankkapazität;
    }

    public String getSpielerName() {
        return spielerName;
    }
    
}
