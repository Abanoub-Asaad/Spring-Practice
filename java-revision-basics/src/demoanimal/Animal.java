package demoanimal;

public abstract class Animal {

    String animalBreed;

    abstract void get();

    final void getAnimalBreed() {
        System.out.println("Dog");
    }

    public void helloWorld() {
        System.out.println("Hello World :)");
    }
}