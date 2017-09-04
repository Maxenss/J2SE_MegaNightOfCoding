package abstract_classes;

public abstract class Cat extends Mammal {
    @Override
    public void walk() {
        System.out.println("Кот гуляет");
    }

    @Override
    public void eat() {
        System.out.println("Кот ест");
    }

    @Override
    public void sleep() {
        System.out.println("Кот спит");
    }

    @Override
    public void grow() {
        System.out.println("Кот растёт");
    }
}
