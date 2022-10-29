package animal;

public class TestDog {
    public TestDog() {
        start();
    }
    private void start() {
        Animal a = new Animal();
        Dog b = new Dog();
        Animal c = new Dog();

        a.move();
        b.move();
        c.move();
    }
}
