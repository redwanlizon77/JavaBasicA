public class Method {
    //Write a method printMessage() that prints a welcome message.
    public void PrintMessage(){
        System.out.println("Welcome to Java Method");
    }
    //Write a method sum(int a, int b) that takes two integers as input and returns their sum.
    public int sum (int a , int b){
        return a + b;
    }
    //Write a method isEven(int num) that checks if a given number is even and returns true or false.
    public boolean isEven(int num)   {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Method printMessage = new Method();
        printMessage.PrintMessage();

        Method summation = new Method();
        int sumResult = summation.sum(20, 40);
        System.out.println("Sum result is: " + sumResult);

        Method result = new Method();
        System.out.println("10 is even number: " + result.isEven(10));
        System.out.println("15 is even number: " + result.isEven(15));
    }
}