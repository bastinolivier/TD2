package city;

import java.time.LocalDateTime;

public class Time {
    public LocalDateTime dateTime;
    public int deltaTick;
    public int minuteTick;

    public Time(LocalDateTime dateTime, int deltaTick, int minuteTick) {
        this.dateTime = dateTime;
        this.deltaTick = deltaTick;
        this.minuteTick = minuteTick;
    }
    public void Run() {

        System.out.println("start Time");

    }
}
