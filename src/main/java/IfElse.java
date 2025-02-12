//a. If the number is even or odd.
//b. If the number is positive, negative, or zero.

public class IfElse {
    public void Condition() {
        int number = 15;
        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
        if (number == 0) {
            System.out.println("The number is zero");
        } else if (number > 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }
    }

//Write a method that takes a student's marks as input and assigns a grade based on the following criteria:
//● 90 - 100 → A
//● 80 - 89 → B
//● 70 - 79 → C
//● 60 - 69 → D
//● Below 60 → F
    public void Condition2(int marks){
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A: " + marks);
        } else if (marks >= 80 && marks <= 90) {
            System.out.println("Grade: B: " + marks);
        } else if (marks >= 60 && marks <= 70) {
            System.out.println("Grade: C: " + marks);
        } else if (marks < 60 && marks >= 0) {
            System.out.println("Grade: F: " + marks);
        } else {
            System.out.println("Invalid Grade");
        }
    }
    public static void main(String[] args) {
        IfElse ifelse = new IfElse();
        ifelse.Condition();
        IfElse ifelse2 = new IfElse();
        ifelse2.Condition2(86);
    }
}