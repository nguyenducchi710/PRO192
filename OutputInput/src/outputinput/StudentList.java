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
public class StudentList {

    public static void main(String[] args) throws ParseException {
        //Khai bao array students chua toi da 5 sinh vien
        Student[] students = new Student[6];
        //Cung cap du lieu cho array students
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        students[0] = new Student(1, "Nguyen Thanh Hai", sdf.parse("12-25-2000"), 72.5);
        students[1] = new Student(2, "Tran Hai Van", sdf.parse("12-12-2001"), 62.8);
        students[2] = new Student(3, "Nguyen Minh Tung", sdf.parse("08-15-2000"), 92.5);
        students[3] = new Student(4, "Ly Hai Van", sdf.parse("06-23-2001"), 35.6);
        students[4] = new Student(5, "Vo Hoang Minh", sdf.parse("05-28-2001"), 82.5);
        students[5] = new Student();
        students[5].addStudent();
        //In danh sach sinh vien
        Student.displayHeader();
        for (Student student : students) {
            student.display2();
        }
        System.out.println(StringEx.repeat("_", 64));
    }
}
