package abstract_classes;

public class GoldRetriever extends HunterDog {
    private String name;

    public GoldRetriever(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void eatBoots() {
        System.out.println("Собака съела ботинки");
    }

    void eatCats() {
        System.out.println("Собака съела соседскую кошку");
    }
}
