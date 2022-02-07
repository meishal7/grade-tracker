/**
 * GradeTracker.java
 * Author:     Elena Mudrakova
 * Module:     9

 * Algorithm:
 * 1. create GradeTracker class with instance vars for all tree quizes, 
 * midterm, final exam, total points, total score
 * 2. create an object
 * 3. display object data with toString()
 * 4. display letter grade
 * 
 * 
 */

import java.util.Scanner;

 
public class Main
{
    public static void main(String[] args)
    {
        GradeTracker student1 = new GradeTracker();
        student1.setQuiz1();
        student1.getQuiz1();
        //student1.print();
        student1.setQuiz2();
        student1.getQuiz2();
        student1.setQuiz3();
        student1.getQuiz3();
        student1.setMidterm();
        student1.getMidterm();
        student1.setFinalExam();
        student1.getFinalExam();
        student1.getTotalPoints();
        student1.getTotalScore();
        System.out.println("\n" + student1);
        student1.letterGrade();
       
    }
 
}
