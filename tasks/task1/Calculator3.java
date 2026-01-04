public class Calculator3 {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }
    double add(int a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator3 calc = new Calculator3();

        System.out.println("Add two integers: " + calc.add(10, 20));
        System.out.println("Add three integers: " + calc.add(5, 10, 15));
        System.out.println("Add two doubles: " + calc.add(2.5, 3.5));
        System.out.println("Add int and double: " + calc.add(10, 4.5));
    }
}
