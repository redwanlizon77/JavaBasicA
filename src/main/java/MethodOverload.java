public class MethodOverload {
    //One version takes two integers and returns their product.
    public int multiply (int a, int b){
        return a *b;
    }
    //Another version takes three integers and returns their product.
    public int multiply (int c, int d, int e){
        return c* d * e;
    }
    //Another version takes two double values and returns their product.
    public double multiply (double f, double g) {
        return f * g;
    }

    public static void main(String[] args) {
        MethodOverload math = new MethodOverload();

        System.out.println("Multiplication of two integer numbers: " +math.multiply (20,30));
        System.out.println("Multiplication of three integer numbers: " +math.multiply (20, 30, 40));
        System.out.println("Multiplication of two double numbers: " +math.multiply(20.5, 30.75));
    }
}
