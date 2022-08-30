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

        // call the overloaded calculateMarks() method
        System.out.println(studentMarks.calculateMarks(100, 99, 100, 70));

        // call the overloaded calculateMarks() method

        System.out.println(studentMarks.calculateMarks(100, 99, 79));


        // call the overloaded calculateMarks3() method

        System.out.println(studentMarks.calculateMarks(100, 98, 99));

    }
}