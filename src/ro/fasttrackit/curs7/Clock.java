package ro.fasttrackit.curs7;

public class Clock {
    //STATE
    private int hour;
    private int minutes;

    public Clock(int hour, int minutes) {
        this.hour = ensureValid(hour, 24);
        this.minutes = ensureValid(minutes, 24);
    }

    public Clock(int hour) {
        this(hour, 0);
    }

    //BEHAVIOR
    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public String getTime() {
        return this.formatTime(hour) + ":" + formatTime(minutes);
    }

    public void setHour(int newHour) {
        this.hour = ensureValid(newHour, 24);
    }

    public void setMinutes(int minutes){
        this.minutes = ensureValid(minutes, 60);
    }

    private int ensureValid(int time, int ceiling){
        return Math.abs(time % ceiling);
    }

    private String formatTime(int minutes) {
        if (minutes < 10) {
            return "0" + minutes;
        } else {
            return "" + minutes;
        }
    }
}
