package demoanimal;

public class Dog {
    String breed;
    int age;
    String color;

    private static Dog dog = new Dog();
    private Dog() {

    }
    static public Dog getInstances() {
        return dog;
    }

    void barking() {

    }

    void hungry() {

    }

    void sleeping() {

    }
}
