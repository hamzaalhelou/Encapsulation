/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A;

/**
 *
 * @author moatasem
 */
public class Main {
    
      public static void main(String[] args) {
 
        
        Employee e = new Employee();
 
        e.name   = "Mohamad";
        e.age    = 21;
        e.salary = 1500000;
 
        
        System.out.println("Name: "   + e.name);
        System.out.println("Age: "    + e.age);
        System.out.println("Salary: " + e.salary);
 
    }
    
}
