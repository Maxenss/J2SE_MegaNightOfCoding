package abstract_classes;

public class Dog extends Mammal {
    @Override
    public void walk() {
        System.out.println("Пёся гуляет");
    }

    @Override
    public void eat() {
        System.out.println("Пёся ест");
    }

    @Override
    public void sleep() {
        System.out.println("Пёся спит");
    }

    @Override
    public void grow() {
        System.out.println("Пёс растет");
    }
}
