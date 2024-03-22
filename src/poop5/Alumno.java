/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 * Es la clase que crea un Alumno con 7 atributos
 * @author poo01alu08
 */
public class Alumno {
    private String nombre;
    private String apellido;
    private int edad;
    private String curso;
    private float promedio;
    private boolean inscrito;
    private Fecha fNacimiento;
    /**
     * Constructor vacio que inicializa en cero o null
     */
    public Alumno() {
    }
    /**
     * Constructor lleno
     * @param nombre nombre del alumno
     * @param apellido apellido del alumno
     * @param edad edad del alumno
     * @param curso curso del alumno
     * @param promedio promedio del alumno
     * @param inscrito inscrito del alumno
     * @param fNacimiento fecha de naciemiento del alumno
     */
    public Alumno(String nombre, String apellido, int edad, String curso, float promedio, boolean inscrito, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.curso = curso;
        this.promedio = promedio;
        this.inscrito = inscrito;
        this.fNacimiento = fNacimiento;
    }

    /**
     * Regresa el nombre del alumno
     * @return la variable nombre
     */
    
    public String getNombre(){
        return nombre;
    }
    /**
     * Establece el nombre del alumno
     */
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    /**
     * Regresa el apellido del alumno
     * @return la variable apellido
     */
    public String getApellido(){
        return apellido;
    }
    /**
     * Establece el apellido del alumno
     */
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    /**
     * Regresa el edad del alumno
     * @return la variable edad
     */
    public int getEdad() {
        return edad;
    }
    /**
     * Establece el edad del alumno
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * Regresa el curso del alumno
     * @return la variable curso
     */
    public String getCurso() {
        return curso;
    }
    /**
     * Establece el curso del alumno
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }
    /**
     * Regresa el promedio del alumno
     * @return la variable promedio
     */
    public float getPromedio() {
        return promedio;
    }
    /**
     * Establece el promedio del alumno
     */
    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }    
    /**
     * Regresa la inscripcion del alumno
     * @return la variable inscrito
     */
    public boolean isInscrito() {
        return inscrito;
    }
    /**
     * Establece el inscripcion del alumno
     */
    public void setInscrito(boolean inscrito) {
        this.inscrito = inscrito;
    }
    /**
     * Regresa el fecha del alumno
     * @return la variable fNacimiento
     */
    public Fecha getfNacimiento() {
        return fNacimiento;
    }
    /**
     * Establece el fecha de nacimeinto del alumno
     */
    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
    
    /**
     * los metodos que realiza el alumno
     */
    
    public void dormir(){
        System.out.println("zzz...");
    }
    public void estudiar(){
        System.out.println("estudiando...");
    }
    public void hacerTarea(){
        System.out.println("haciendo tarea...");
    }
    public void hacerExamen(){
        System.out.println("haciendo examen...");
    }
    public void tomarNotas(){
        System.out.println("tomando notas");
    }
    /**
     * sobreescribe el objeto
     * @return la representacion en forma de cadena del objeto
     */
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", curso=" + curso + ", promedio=" + promedio + ", inscrito=" + inscrito + ", fNacimiento=" + fNacimiento + '}';
    }

 

    

    
    
    
    
    
    
    
}

