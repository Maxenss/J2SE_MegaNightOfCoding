package abstract_classes;

public class Main {
    public static void main(String[] args) {
        GoldRetriever goldRetrieverDog =
                new GoldRetriever("Кусака");

        // Приведение объекта класса GoldRetriever
        // к родительскому классу(интерфейсу) Animal
        Animal animal = (Animal) goldRetrieverDog;

        System.out.println("Собака приведенная к животному : ");
        animal.born();
        animal.eat();
        animal.grow();
        animal.reproduction();
        animal.walk();
        animal.sleep();

        Tiger tiger = new Tiger();

        // Приведение объекта класса Tiger
        // к родительскому классу(интерфейсу) Animal
        Animal animal2 = (Animal) tiger;

        System.out.println("Кошка приведенная к животному : ");
        animal2.born();
        animal2.eat();
        animal2.grow();
        animal2.reproduction();
        animal2.walk();
        animal2.sleep();

        Animal[] animals = new Animal[2];
        animals[0] = animal;
        animals[1] = animal2;
    }
}
