/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4;

/**
 *
 * @author noorm
 */
public class StudentTest {
    public static void main (String[] args){
        Student student1 = new Student("Jane Doe", 93.5);
        Student student2 = new Student("John Doe", 67.3);
        
        System.out.printf("%s's letter grade is: %s%n",
                student1.getName(), student1.getLetterGrade());
        System.out.printf("%s's letter grade is: %s%n",
                student2.getName(), student2.getLetterGrade());
    }
}
