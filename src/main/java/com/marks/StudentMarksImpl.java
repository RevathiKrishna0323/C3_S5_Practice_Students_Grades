/*
 * Author Name: Revathi
 * Date: 30-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */

package com.marks;

public class StudentMarksImpl {
    public static void main(String[] args) {

        // create an object of the class
        StudentMarks studentMarks = new StudentMarks();

        // call the overloaded calculateMarks1() method
        studentMarks.calculateMarks1(100, 99, 100, 70);

        // call the overloaded calculateMarks2() method

        studentMarks.calculateMarks2(100, 99, 100);


        // call the overloaded calculateMarks3() method

        studentMarks.calculateMarks3(100, 99);

    }
}