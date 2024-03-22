/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 * Es la clase que crea Fecha con 3 atributos dia,mes y año
 * @author poo01alu08
 */
class Fecha {
    private int dia,anio;
    private String mes;
    /**
     * Constructor vacio que inicializa en cero o null
     */
    public Fecha() {
    }
    /**
     * Constructor lleno
     * @param dia dia de la fecha 
     * @param anio año de la fecha
     * @param mes mes de la fecha
     */
    public Fecha(int dia, int anio, String mes) {
        this.dia = dia;
        this.anio = anio;
        this.mes = mes;
    }
    /**
     * Regresa el dia de la fecha
     * @return la variable dia
     */
    public int getDia() {
        return dia;
    }
    /**
     * Establece el dia
     */
    public void setDia(int dia) {
        this.dia = dia;
    }
    /**
     * Regresa el anio de la fecha
     * @return la variable anio
     */
    public int getAnio() {
        return anio;
    }
    /**
     * establece el anio de la fecha
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    /**
     * Regresa el mes de la fecha
     * @return la variable mes
     */
    public String getMes() {
        return mes;
    }
    /**
     * Establece el mes de la fecha
     */
    public void setMes(String mes) {
        this.mes = mes;
    }
    /**
     * sobreescribe el objeto
     * @return la representacion en forma de cadena del objeto
     */
    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", anio=" + anio + ", mes=" + mes + '}';
    }
    
    
}
