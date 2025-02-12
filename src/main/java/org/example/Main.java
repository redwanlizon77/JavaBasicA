//1. Declare variables of different data types(int, double, char, boolean, String) and assign values to them.
//2. Print the values of these variables using System.out.println().

package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String food = "kacchi biriyani"; //stores text, surrounded by double quotes
        int myNumber = 88;               //stores (whole numbers without decimals)
        float myNumber1 = 8.8f;          //stores floating point numbers with decimals
        char myCharacter = 'A';          //stores single characters(a,b,c) surrounded by single quotes
        double myNumber2 = 88.88;        //stores long floating point numbers with decimals
        boolean myBoolean = true;        //stores values with two states, either true or false

        System.out.println("My favorite food is: " + food);
        System.out.println("Integer number : " + myNumber);
        System.out.println("Float number : " + myNumber1);
        System.out.println("Character is: " + myCharacter);
        System.out.println("Double number : " + myNumber2);
        System.out.println("Boolean is: " + myBoolean);

    }
}