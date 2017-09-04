package night_is_here;

public class Westeros {
    Hodor hodor;
    Jemmy jemmy;
    JohnSnow johnSnow;
    KingOfNight kingOfNight;
    Sarsei sarsei;
    Tirion tirion;

    Unit[] units;

    public Westeros(Hodor hodor,
                    Jemmy jemmy,
                    JohnSnow johnSnow,
                    KingOfNight kingOfNight,
                    Sarsei sarsei,
                    Tirion tirion) {
        this.hodor = hodor;
        this.jemmy = jemmy;
        this.johnSnow = johnSnow;
        this.kingOfNight = kingOfNight;
        this.sarsei = sarsei;
        this.tirion = tirion;

        units = new Unit[6];

        units[0] = this.hodor;
        units[1] = this.jemmy;
        units[2] = this.johnSnow;
        units[3] = this.kingOfNight;
        units[4] = this.sarsei;
        units[5] = this.tirion;

        war();
    }

    void war() {
        Unit champion1 = units[0].fight(units[1]);
        Unit champion2 = units[2].fight(units[3]);
        Unit champion3 = units[4].fight(units[5]);

        Unit winner = null;

        if (champion1 != null && champion2 != null) {
            winner = champion1.fight(champion2);
        }

        Unit absolute_winner = null;

        if (winner != null) {
            absolute_winner = winner.fight(champion3);
        } else {
            System.out.println("Победитель : " + champion3.name);
        }

        if (absolute_winner != null) {
            System.out.println("Победитель : " + absolute_winner.name);
            return;
        }

        System.out.println("Winter is here...");
    }
}
