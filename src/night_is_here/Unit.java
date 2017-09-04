package night_is_here;

import sun.security.provider.SecureRandom;

import java.util.Random;

public abstract class Unit {
    // Имя
    String name;
    // Полное
    int fullHp;
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
        this.fullHp = hp;
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
        System.out.println("Начался бой !!!");
        System.out.println("Информация о первом бойце : ");
        System.out.println(this.toString());
        System.out.println("Информация о втором бойце : ");
        System.out.println(unit.toString());
        int round = 1;
        Random random = new Random();
        int critFlag;
        while (true) {
            critFlag = random.nextInt(10);
            System.out.println("Раунд : " + round);
            // Выводим информацию об персонажах
            System.out.println(this.name + " HP : " + this.hp);
            System.out.println(unit.name + " HP : " + unit.hp);
            if (this.hp <= 0) {
                System.out.println(this.name + " умер :(");
                unit.respawn();
                return unit;
            } else if (unit.hp <= 0) {
                System.out.println(unit.name + " умер :(");
                this.respawn();
                return this;
            } else if (this.hp <= 0 && unit.hp <= 0) {
                System.out.println(this.name + " и " +
                        unit.name + " померли :(");
                return null;
            }

            this.hp -= unit.damage * (critFlag == 3 ? 2 : 1) -
                    this.armor +
                    (unit.stamina * (isBrained ? 0.4 : 0.6));

            unit.hp -= this.damage * (critFlag == 5 ? 2 : 1) -
                    unit.armor +
                    (this.stamina * (isBrained ? 0.4 : 0.6));

            ++round;
        }
    }

    public void respawn() {
        this.hp = this.fullHp;
    }
}
