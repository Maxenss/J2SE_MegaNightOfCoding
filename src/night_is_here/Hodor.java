package night_is_here;

public class Hodor extends Unit {
    public Hodor(int hp,
                 int stamina,
                 int armor,
                 int damage,
                 boolean isBrained) {
        // Вызов конструктора родительского класса Unit
        super("Hodor", hp, stamina, armor, damage, isBrained);
    }
}
