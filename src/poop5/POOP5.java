/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop5;

/**
 * Programa que crea iteraciones de Objetos y asignando los atributos dependiendo su encapsulamiento
 * @author poo01alu08
 */
public class POOP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Fac. Medicina Buitres
        Alumno alumno1 = new Alumno();//variable de tipo alumna que esta creando un objeto con el constructor vacio
        //tratamos de imprimir el nombre con el operador punto
        /*
        alumno1.nombre="jose";
        alumno1.apellido="perez";
        alumno1.edad=19;
        alumno1.curso="licenciado"; netbeans nos avisa que la estamos regando
        alumno1.promedio=9.9;  ponerlo como comentario como lo hice
        System.out.println(alumno1.nombre);
        System.out.println(alumno1);
        System.out.println(alumno1.toString());// esta linea no es necesario si se genero el metodo to string previamente ya que java lo idetificara como una cadena
        */
        //proposicion lambda pero no la reconocemos por que tercer semestre
        alumno1.setNombre("Jose");
        alumno1.setApellido("Perez");
        alumno1.setEdad(19);
        alumno1.setCurso("POO");
        alumno1.setPromedio((float) 9.3);
        System.out.println(alumno1.getNombre());
        System.out.println(alumno1.getApellido());
        System.out.println(alumno1.getEdad());
        System.out.println(alumno1.getCurso());
        System.out.println(alumno1.getPromedio());
        System.out.println(alumno1);
        Alumno alumno2 = new Alumno();
        System.out.println(alumno2);
        
        Circulo circulo=new Circulo(7);
        System.out.println(circulo);
        System.out.println(circulo.getPerimetro());
        System.out.println(circulo.getArea());
        Fecha fNacimiento = new Fecha(12,1999,"octubre");
        Alumno alumno3=new Alumno("Jose","Perez",19,"POO",8.8f,true,fNacimiento);
        System.out.println(alumno3);
        Alumno alumno4= new Alumno("Pedro","Ramirez",29,"POO",7.6f,false,new Fecha(12,1723,"Octubre"));
        System.out.println(alumno4);
        //crear un coche con diagrama de clases y la parte del codigo
                
    }
    
}

