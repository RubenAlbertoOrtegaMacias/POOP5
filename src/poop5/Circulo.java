/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 * Es la clase que crea un Circulo con el atributo de radio
 * @author poo01alu08
 */
public class Circulo {
    final float PI = 3.14159f;
    private float radio;
    /**
     * Constructor vacio que inicializa en cero o null
     */
    public Circulo() {
    }
    /**
     * Constructor lleno
     * @param radio radio del circulo
     */
    public Circulo(float radio) {
        this.radio = radio;
    }
    /**
     * Regresa el radio del circulo
     * @return la variable radio
     */
    public float getRadio() {
        return radio;
    }
    /**
     * establece el radio del circulo
     */
    public void setRadio(float radio) {
        this.radio = radio;
    }
    /**
     * Regresa el Perimetro del circulo
     * @return la variable perimetro
     */
    public float getPerimetro(){
        return 2*PI*radio;
    }
    /**
     * Regresa el area del circulo
     * @return la variable area
     */
    public float getArea(){
        return PI*radio*radio;
    }
    /**
     * Regresa el objeto en forma de cadena
     * @return representacion en cadena
     */
    @Override
    public String toString() {
        return "Circulo{" + "PI=" + PI + ", radio=" + radio + '}';
    }
    
    
    
}
