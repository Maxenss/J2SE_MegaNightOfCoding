package night_is_here;

public class Main {
    public static void main(String[] args) {
        JohnSnow johnSnow = new JohnSnow(150,
                15,
                12,
                56,
                true);
        KingOfNight kingOfNight = new KingOfNight(1000,
                15,
                10,
                5,
                false);
        Hodor hodor = new Hodor(200,
                30,
                3,
                3,
                false);
        Jemmy jemmy = new Jemmy(300,
                30,
                20,
                20,
                true);
        Sarsei sarsei = new Sarsei(50,
                10,
                30,
                15,
                true);
        Tirion tirion = new Tirion(10,
                100,
                1,
                2,
                true);


        Westeros westeros = new Westeros(
                hodor,
                jemmy,
                johnSnow,
                kingOfNight,
                sarsei,
                tirion
        );
    }
}
