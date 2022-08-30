/*
 * Author Name: Revathi
 * Date: 30-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */

package com.marks;

public class StudentMarksImpl {
    // create an object of the class
    StudentMarks studentMarks = new StudentMarks();

    // call the overloaded calculateMarks1() method
    public void calculateMarks1() {
        studentMarks.calculateMarks1(100, 99, 100, 70);
    }

    // call the overloaded calculateMarks2() method
    public void calculateMarks2() {
        studentMarks.calculateMarks2(100, 99, 100);
    }

    // call the overloaded calculateMarks3() method
    public void calculateMarks3() {
        studentMarks.calculateMarks3(100, 99);
    }
}