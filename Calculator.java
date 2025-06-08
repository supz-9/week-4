class Calculator {
    public void calculate(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    public void calculate(int a, int b, char op1) {
        if (op1 == '-') {
            System.out.println("Subtraction: " + (a - b));
        }
    }

    public void calculate(double a, double b, char op2) {
        if (op2 == '*') {
            System.out.println("Multiplication: " + (a * b));
        }
    }

    public void calculate(float a, float b, char op3, String type) {
        if (op3 == '/' && b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.calculate(10, 5);
        c.calculate(10, 5, '-');
        c.calculate(4.5, 2.0, '*');
        c.calculate(10f, 2f, '/', "div");
    }
}