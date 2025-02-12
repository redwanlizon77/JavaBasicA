//1. Take two integer inputs from the user and performs the following operations:
//   Addition,Subtraction, Multiplication, Division, Modulus
//2. Display the results of each operation.

public class Operators{
    public void Operator(){
        int num1 = 30;
        int num2 = 50;
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1%num2);
        System.out.println(num1/num2);

    }
    public static void main(String[] args) {
        Operators Op = new Operators();
        Op.Operator();

    }
}