package calculator;

public class Calculation {
    int res;
    public int add(int x, int y) {
        res = x + y;
        return res;
    }

    public int subtract(int x, int y) {
        res = x - y;
        return res;
    }

    public void display() {
        System.out.println("Hello from parent class :)");
    }
}

