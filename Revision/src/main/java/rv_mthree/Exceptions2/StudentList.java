/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rv_mthree.Exceptions2;

/**
 *
 * @author rachelvickerman
 */
public class StudentList {
    
    private Student[] students;
    private int noOfStudents;
    
    public StudentList(int noOfStudents) {
        this.noOfStudents = noOfStudents;
        students = new Student[noOfStudents];
    }
    
    public void inputStudent(Student student, int index) throws rollNoCheckedException {
        if (students[0] == null) { // if the first entry of the array is empty
            students[0] = student; // fill it
        } 
        else { // otherwise
            for (int j = 0; j < noOfStudents; j++) { // for all the members of the employee list array
                if ((students[j].getRollNo()) == (student.getRollNo())) { // if the name of the employee being added equals an existing employees name
                    throw new rollNoCheckedException("This roll no. is already in being used."); // throw duplicate exception
                }
            }
        }
    }
    
    public void displayStudentList() {
        for (int i = 0; i < noOfStudents; i++) {
            students[i].display();
        }
           
        
    }
    
}
