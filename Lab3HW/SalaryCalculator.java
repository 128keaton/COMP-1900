import java.util.Scanner;

/* Calculates the salary for a U.S. Federal government employee based off of grade and step.

I used String for the salary values since I wanted to have "error detection" without an if statement.
The instructions also do not state that you need to store the salary values in a float.
It was just done for simplicity.

Keaton Burleson, 2018.

*/

public class SalaryCalculator{
    static Scanner scnr = new Scanner(System.in);
    static int grade = 0;
    static int step = 0;
        
    public static void main(String[] args){
        System.out.println("Welcome to the U.S. Federal Salary Calculator.");
        System.out.print("Please input your grade level: ");
        grade = scnr.nextInt();
        System.out.print("Please input your step level: ");
        step = scnr.nextInt();
        System.out.println("Result: " + calculateSalary(grade, step));
        System.out.println("Have a nice day!");
    }

    // Salary calculation function
    public static String calculateSalary(int grade, int step){
        switch(grade){
            case 1:
            return getGradeOneSalary(step);

            case 2: 
            return getGradeTwoSalary(step);

            case 3:
            return getGradeThreeSalary(step);

            case 4:
            return getGradeFourSalary(step);

            default:
            return "You did not input a valid grade.";
        }
    }

    // Calculates salary for grade one
    // This level of abstraction (getGradeX) is not practical beyond this many grades. Simply done for cleanliness.
    public static String getGradeOneSalary(int step){
        switch(step){
            case 1:
            return "$18,765";

            case 2: 
            return "$19,414";

            case 3:
            return "$20,039";

            default:
            return invalidStep();
        }
    }

    // Calculates salary for grade two
    public static String getGradeTwoSalary(int step){
        switch(step){
            case 1:
            return "$21,121";

            case 2: 
            return "$21,624";

            case 3:
            return "$22,323";

            default:
            return invalidStep();
        }
    }

    // Calculates salary for grade three
    public static String getGradeThreeSalary(int step){
        switch(step){
            case 1:
            return "$23,045";

            case 2: 
            return "$23,813";

            case 3:
            return "$24,581";

            default:
            return invalidStep();
        }
    }

    // Calculates salary for grade four
    public static String getGradeFourSalary(int step){
        switch(step){
            case 1:
            return "$25,871";

            case 2: 
            return "$26,733";

            case 3:
            return "$27,595";

            default:
            return invalidStep();
        }
    }

    public static String invalidStep(){
        return "You did not input a valid step.";
    }

}