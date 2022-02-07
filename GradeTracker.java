/**
 * GradeTracker.java
 * Author:     Elena Mudrakova
 * Module:     9

 * Description: GradeTracker class with following:
 * 1. 3 instance vars for three quizes score
 * 2. instance var for midterm score
 * 3. instance var for final exam score
 * 4. instance var for total points
 * 5. instance var for total score in %
 * 6. setters and getters for all instance vars, exept total points
 * and total score, they have only getters
 * 7. method for defining the letter grade
 * 8. toString() method prints all objects data
 * 9. equals() method compares score for all quizes, midterm and final exam 
 *  
 * 
 */

import java.util.Scanner;

public class GradeTracker
{
    // **************** instance variables are (usually) private ******************
    private int quiz1;
    private int quiz2;
    private int quiz3;
    private int midterm;
    private int finalExam;
    private int totalPoints;
    private double totalScore;
   
    // **************************** Constructor **********************************
    public GradeTracker()
    {
        
    }
    
    //Setteres and getters 
    public void setQuiz1()
    {
        System.out.println("Enter score(points) for Quiz 1: ");
        Scanner keyboard = new Scanner(System.in);        
        quiz1 = keyboard.nextInt(); 
        if(quiz1 < 0 || quiz1 > 10)
        {
            System.out.println("You entered invalid number.Try again.");
            System.exit(0);
        }
        
    }
    
    public int getQuiz1()
    {
        
        return quiz1;
    }
    
    public void setQuiz2()
    {
        System.out.println("Enter score(points) for Quiz 2: ");
        Scanner keyboard = new Scanner(System.in);        
        quiz2 = keyboard.nextInt(); 
        
        if(quiz2 < 0 || quiz2 > 10)
        {
            System.out.println("You entered invalid number.Try again.");
            System.exit(0);
        }
    }
    
    public int getQuiz2()
    {
        return quiz2;
    }
    
    public void setQuiz3()
    {
        System.out.println("Enter score(points) for Quiz 3: ");
        Scanner keyboard = new Scanner(System.in);        
        quiz3 = keyboard.nextInt(); 
        
        if(quiz3 < 0 || quiz3 > 10)
        {
            System.out.println("You entered invalid number.Try again.");
            System.exit(0);
        }
    }
    
    public int getQuiz3()
    {
        return quiz3;
    }
    
    public void setMidterm()
    {
        System.out.println("Enter score(points) for the Midterm exam: ");
        Scanner keyboard = new Scanner(System.in);        
        midterm = keyboard.nextInt();
        
        if(midterm < 1 || midterm > 100)
        {
            System.out.println("You entered invalid number.Try again.");
            System.exit(0);
        }
    }
    
    public int getMidterm()
    {  
        return midterm;
    }
    
    public void setFinalExam()
    {
        System.out.println("Enter score(points) for Final Exam: ");
        Scanner keyboard = new Scanner(System.in);
        finalExam = keyboard.nextInt(); 
        if(finalExam < 0 || finalExam > 100)
        {
            System.out.println("You entered invalid number.Try again.");
            System.exit(0);
        }
    }
    
    public int getFinalExam()
    {
         return finalExam;
    }
    //Total points
    public int getTotalPoints()
    {
        totalPoints = getQuiz1() + getQuiz2() + getQuiz3() + getMidterm() + getFinalExam();
        
        return totalPoints;
    }
    //Total score %
    public double getTotalScore()
    {
        double quiz1percentage = ((double)getQuiz1() / 10) * 8.333;
        double quiz2percentage = ((double)getQuiz2() / 10) * 8.333;
        double quiz3percentage = ((double)getQuiz3() / 10) * 8.333;
        double midtermPercentage = ((double)getMidterm() / 100) * 35;
        double finalExamPercentage = ((double)getFinalExam() / 100) * 40;
        
        
        totalScore = quiz1percentage + quiz1percentage + 
                     quiz1percentage + midtermPercentage + 
                     finalExamPercentage;
                     
                     /*System.out.println("totalscore" + totalScore);
                     System.out.println("q1% " + quiz1percentage);
                     System.out.println("q2% " + quiz2percentage);
                     System.out.println("q3% " + quiz3percentage);
                     System.out.println("midterm% " + midtermPercentage);
                     System.out.println("fex% " + finalExamPercentage);*/
                    
                     
        
        return totalScore;
    
    }
    
    
    //Letter grade
    public void letterGrade()
    {
        if(getTotalScore() <= 100 && getTotalScore() >= 90)
        {
            System.out.println("Your grade is A.");
        }
        else if(getTotalScore() <= 89 && getTotalScore() >= 80)
        {
            System.out.println("Your grade is B.");
        }
        else if(getTotalScore() <= 79 && getTotalScore() >= 70)
        {
            System.out.println("Your grade is C.");
        }
        else if(getTotalScore() <= 69 && getTotalScore() >= 60)
        {
            System.out.println("Your grade is D.");
        }
        else
        {
            System.out.println("Your grade is F.");
        }
         
    }
    
    public String toString()
    {
        return "Quiz 1 points: " + getQuiz1() +"\n" +
               "Quiz 2 points: " + getQuiz2() + "\n" +
               "Quiz 3 points: " + getQuiz3() + "\n" +
               "Midterm points: " + getMidterm() + "\n"+
               "Final Exam points: " + getFinalExam() + "\n"+
               "Total Points: " + getTotalPoints() + "\n" +
               "Total Score: " + getTotalScore() + "%" + "\n";
               
    }
    
    public boolean equals(GradeTracker anotherGradeTracker)
    {
        return (this.getQuiz1() == anotherGradeTracker.getQuiz1() &&
               this.getQuiz2() == anotherGradeTracker.getQuiz2() &&
               this.getQuiz3() == anotherGradeTracker.getQuiz3() &&
               this.getMidterm() == anotherGradeTracker.getMidterm() &&
               this.getFinalExam() == anotherGradeTracker.getFinalExam() &&
               this.getTotalPoints() == anotherGradeTracker.getTotalPoints() &&
               this.getTotalScore() == anotherGradeTracker.getTotalScore());
               
               
    }
 
}
