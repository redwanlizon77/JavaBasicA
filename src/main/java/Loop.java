public class Loop {
    //Write a program to print numbers from 1 to 20 using a for loop
    public void ForLoop() {
        int a ;
        for (a = 1; a<=20; a++){
            System.out.println(a);
        }
    }
    //Write a program to print only even numbers between 1 to 50 using a while loop.
    public void WhileLoop() {
        int b = 2; //start from 1st even number: 2
        while (b <= 50) {
            System.out.println(b);
            b += 2;
        }
    }
    //Write a program to print the sum of all numbers from 1 to 100 using a do-while loop
    public void DoWhileLoop(){
        int num = 1;
        int sum = 0;
        do {
            sum += num;
            num++;
        } while (num <= 100);
        System.out.println("Sum of all numbers(1-100): " + sum);
    }
    //Write a Java program that takes a number as input and reverses its digits using a while loop.
    public void ReverseNum(){
        int number = 6789;
        int reverseNumber = 0;
        
        while( number != 0) { //continue loop until number = 0
            reverseNumber = reverseNumber * 10 + number % 10;
            number = number / 10;
        }
        System.out.println("Reversed number : " + reverseNumber);
    }
    //Write a program that takes a number as input and calculates the sum of its digits using a while loop.
    public void DigitSum(){
        int num1 = 47576;
        int sum1 = 0;

        while (num1 != 0) {
            sum1 += num1 % 10;
            num1 /= 10;
        }
        System.out.println("Sum of the digits: " + sum1);
    }

    public static void main(String[] args) { //Call all the methods under the main method
        Loop loop = new Loop();
        loop.ForLoop();

        Loop loop2 = new Loop();
        loop2.WhileLoop();

        Loop loop3 = new Loop();
        loop3.DoWhileLoop();

        Loop loop4 = new Loop();
        loop4.ReverseNum();

        Loop loop5 = new Loop();
        loop5.DigitSum();
    }
}
