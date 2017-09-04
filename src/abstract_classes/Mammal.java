package abstract_classes;

public abstract class Mammal implements Animal{
    @Override
    public void born() {
        System.out.println("Живородящие");
    }

    @Override
    public void reproduction() {
        System.out.println("Нужна самка и самец. Дальше вы знаете...");
    }
}
