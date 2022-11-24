/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package analisisreflexion;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Scanner;

/**
 *
 * @author Kristian
 */
public class AnalisisReflexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Introduzca el nombre de una Class para ver sus características\n");
        Scanner input = new Scanner(System.in);
        String clase = input.nextLine();
        Class cl;
        try{
            cl = Class.forName(clase); 
            System.out.println("Las características de la clase "+cl.getName()+" son: ");
            System.out.println("Constructores - > ");
            obtenConstructores(cl);
            System.out.println("Campos - > ");
            obtenCampos(cl);
            System.out.println("getModifiers() - > "+ cl.getModifiers());
            
        }catch(ClassNotFoundException ex){
            
            System.out.println("Introduzca el nombre de una Class válida para ver sus características\n");
            
        }
           
    }
    
    public static void obtenConstructores(Class clase){
        Constructor[] constructores = clase.getDeclaredConstructors();
        
        System.out.println("Los constructores de la clase "+ clase.getName()+ " son: ");  
        for(Constructor c : constructores){
            String nombre = c.getName();
            System.out.println(nombre);        
        }
                
    }
    
    public static void obtenCampos(Class clase){
        Field[] campos = clase.getFields();
        
        System.out.println("Los constructores de la clase "+ clase.getName()+ " son: ");  
        for(Field c : campos){
            String nombre = c.getName();
            System.out.println(nombre);        
        }
                
    }
    
}
