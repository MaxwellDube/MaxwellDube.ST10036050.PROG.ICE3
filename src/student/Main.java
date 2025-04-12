/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author maxwe
 */
import javax.swing.JOptionPane;
public class Main {
    
    public static void main(String[] args) {
        
         Student stud = new Student("lo", "lo","lo" , 0, 0);
        
        
        String sId = JOptionPane.showInputDialog(null, "Student ID", "Sudent ID", JOptionPane.QUESTION_MESSAGE);
        String sName = JOptionPane.showInputDialog(null, "Name", "Sudent Name", JOptionPane.QUESTION_MESSAGE);
        String slastName = JOptionPane.showInputDialog(null, "LastName", "Sudent LastName", JOptionPane.QUESTION_MESSAGE);
        String inputAge = JOptionPane.showInputDialog(null, "Age");
        String inputGpga = JOptionPane.showInputDialog(null, "GPA");
        
        int sAge = Integer.parseInt(inputAge);
        double sGPA = Double.parseDouble(inputGpga);
                
        
        stud.setId(sId);
        stud.setName(sName);
        stud.setlastName(slastName);
        stud.setAge(sAge);
        stud.setGPA(sGPA);

        
        System.out.println(stud.getId() + " " + stud.getName() + " " + stud.getlastName() + " " + stud.getAge() + " " +  stud.getGPA());
        
    }
    
    
}
