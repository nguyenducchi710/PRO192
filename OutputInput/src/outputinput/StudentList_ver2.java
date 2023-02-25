/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outputinput;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author asus
 */
public class StudentList_ver2 {
    Student[] students;

    public StudentList_ver2(int n) {
        students = new Student[n];
    }
    
    public void inputStudent() throws ParseException {
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].addStudent();
        }
    }
    
    public void displayStudents(){
        Student.displayHeader();
        for (Student student : students) {
            student.display2();
        }
        System.out.println(StringEx.repeat("_", 64));
    }

    public static void main(String[] args) throws ParseException {
        StudentList_ver2 list = new StudentList_ver2(1);
        list.inputStudent();
        list.displayStudents();
    }
    
    
}
