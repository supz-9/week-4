class Operation {
    public void calculate() {
        System.out.println("Performing operation in parent class..");
    }
}

class Addition extends Operation {
    @Override
    public void calculate() {
        int a = 10, b = 5;
        System.out.println("Addition in child class: " + (a + b));
    }
}

public class Main1 {
    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.calculate();
    }
}