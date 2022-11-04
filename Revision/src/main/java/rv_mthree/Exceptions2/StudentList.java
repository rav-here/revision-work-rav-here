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
    
    // variables of class
    private Student[] students;
    private int noOfStudents;
    
    // constructor of clsss
    public StudentList(int noOfStudents) {
        this.noOfStudents = noOfStudents;
        students = new Student[noOfStudents]; // make array of student type and length noOfStudents
    }
    
    // method for inputting student object into array
    public void inputStudent(Student student, int index) throws rollNoCheckedException { 
        if (students[0] == null) { // if the first entry of the array is empty
            students[0] = student; // fill it
        } 
        else { // otherwise
            for (int j = 0; j < noOfStudents; j++) { // for all the members of the student list array
                if ((students[j].getRollNo()) == (student.getRollNo())) { // if the rollNo of the student being added equals an existing students name
                    throw new rollNoCheckedException("This roll no. is already in being used."); // throw duplicate exception
                }
            }
        }
    }
    
    // method for displaying student list
    public void displayStudentList() {
        for (int i = 0; i < noOfStudents; i++) {
            students[i].display();
        }
           
        
    }
    
}
