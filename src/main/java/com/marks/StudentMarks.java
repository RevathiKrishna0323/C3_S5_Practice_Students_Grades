/*
 * Author Name: Revathi
 * Date: 30-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */

package com.marks;

public class StudentMarks {
    //define attributes for the class
    int maths;
    int physics;
    int chemistry;
    int biology;
    int finance;
    int accounting;
    int businessStudies;

    //create the calculateMarks() method to calculate marks for medical pathway students
    public int calculateMarks(int maths, int physics, int chemistry, int biology) {
        int sum = 0;
        sum = maths + physics + chemistry;
        // System.out.println("sum = " + sum);
        return sum;
    }

    //create the calculateMarks() method to calculate marks for non - medical pathway students
    public int calculateMarks(int maths, int physics, int chemistry) {
        int totalMarks = 0;
        totalMarks = maths + physics + chemistry;
        // System.out.println("totalMarks = " + totalMarks);
        return totalMarks;
    }

    //create the calculateMarks() method to calculate marks for business pathway students
    public int calculateMarks(byte businessStudies, int finance, int accounting) {
        int totalMarks = 0;
        totalMarks = businessStudies + finance + accounting;
        //System.out.println("totalMarks = " + totalMarks);
        return totalMarks;
    }
}
