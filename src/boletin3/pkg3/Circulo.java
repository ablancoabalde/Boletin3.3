
package boletin3.pkg3;

public class Circulo {
    private double radio;
    private final double pi = 3.14;
    
    public Circulo(){
        
    }
    public Circulo(double r){
        radio =r;
    }
    public double getRadio(){
        
        return radio;
    }
    public void setRadio(double r){
        radio=r;
    }
    
    public double  calcularArea(){
        
        return pi * Math.pow(radio, 2);
    }
    
    public double lonxitudeRadio(){
        
        return 2 * pi *radio;
    }
}
