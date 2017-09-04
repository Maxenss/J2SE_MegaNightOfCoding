package night_is_here;

public abstract class Unit {
    // Имя
    String name;
    // Здоровье
    int hp;
    // Выносливость
    int stamina;
    // Броня
    int armor;
    // Урон
    int damage;
    // Наличие ума
    boolean isBrained;

    public Unit(String name,
                int hp,
                int stamina,
                int armor,
                int damage,
                boolean isBrained) {
        this.name = name;
        this.hp = hp;
        this.stamina = stamina;
        this.armor = armor;
        this.damage = damage;
        this.isBrained = isBrained;
    }

    // Переопределение метода toString родительского класса Object
    @Override
    public String toString() {
        String infoAboutUnit = "";
        infoAboutUnit += "Name : " + this.name +
                "\nHP : " + this.hp +
                "\nStamina : " + this.stamina +
                "\nArmor : " + this.armor +
                "\nDamage : " + this.damage +
                "\nisBraned : " + this.isBrained;

        return infoAboutUnit;
    }

    public Unit fight(Unit unit) {
        int round = 1;
        while (true) {
            System.out.println("Раунд : " + round);
            // Выводим информацию об персонажах
            System.out.println("Информация о первом бойце : ");
            System.out.println(this.toString());
            System.out.println("Информация о втором бойце : ");
            System.out.println(unit.toString());
            if (this.hp <= 0) {
                System.out.println(this.name + " умер :(");
                return unit;
            } else if (unit.hp <= 0) {
                System.out.println(unit.name + " умер :(");
                return this;
            } else if (this.hp <= 0 && unit.hp <= 0) {
                System.out.println(this.name + " и " +
                        unit.name + " померли :(");
                return null;
            }

            this.hp -= unit.damage -
                    this.armor +
                    (unit.stamina * (isBrained ? 0.4 : 0.6));
            unit.hp -= this.damage -
                    unit.armor +
                    (this.stamina * (isBrained ? 0.4 : 0.6));

            ++round;
        }
    }
}
