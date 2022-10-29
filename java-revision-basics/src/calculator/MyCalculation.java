package calculator;

public class MyCalculation extends Calculation implements ICalculation2 {
    public int multiply(int x, int y) {
        res = x * y;
        return res;
    }

    @Override
    public void display() {
        System.out.println("Hello from child class :)");
    }
}