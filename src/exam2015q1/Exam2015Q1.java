/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2015q1;
import java.lang.reflect.*;
import java.lang.*;
import java.util.List;

/**
 *
 * @author dileeparajapaksa
 */
public class Exam2015Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
        
        int premCount=0;
        Class cls= Class.forName("ReflectTest");
        Field[] fields= cls.getFields();

        for(Field f:fields)
        {
            
            if(f.getType().isPrimitive())
            {
                premCount++;
                
            }
        }
        
        System.out.println("Number of primitives : "+ premCount);
    }
    
}
