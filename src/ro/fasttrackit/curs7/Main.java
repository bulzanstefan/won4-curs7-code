package ro.fasttrackit.curs7;

public class Main {
    public static void main(String[] args) {

        System.out.println(Math.abs(2));

        Clock clock = new Clock(10, 5);
        Clock ceasuLuGhita = new Clock(11);

        System.out.println(clock.getTime());
        System.out.println(ceasuLuGhita.getTime());

//        System.out.println(clock.hour);
//        clock.hour = 55;
//        System.out.println(clock.getTime());

        Clock badClock = new Clock(99999, 77);
        Clock badClock2 = new Clock(-99999, -77);
        System.out.println(badClock.getTime());
        System.out.println(badClock2.getTime());
        badClock.setHour(1111111);
        System.out.println(badClock.getTime());
    }

    public void ceva(Clock clock) {
        System.out.println(clock.getTime());
//        clock.formatTime();
    }
}
