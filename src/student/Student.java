/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student;

/**
 *
 * @author maxwe
 */
import javax.swing.JOptionPane;

public class Student {
   
    private String Id;
    private String name;
    private String lastName;
    private int age;
    private double gpa;
    
    Student(String Id, String name, String lastname, int age, double gpa){
        this.Id = Id;
        this.name = name;
        this.lastName = lastname;
        this.age = age;
        this.gpa = gpa;
    
    }
    
    public String getId(){
        return this.Id;
    }
    public String getName(){
        return this.name;
    }
    public String getlastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    public double getGPA(){
        return this.gpa;
    }
    
   //setter methods
    public void setId(String Id){
        this.Id = Id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setlastName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setGPA(double gpa){
        this.gpa = gpa;
    }

    
}
