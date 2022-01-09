package city;
import java.time.DayOfWeek;
import java.time.LocalDateTime;


class Schedule {

    private DayOfWeek weekDayStart = DayOfWeek.MONDAY;
    private DayOfWeek weekDayStop = DayOfWeek.SUNDAY;
    int DayHourStart = 0;
    int DayHourStop = 24;

    Schedule(DayOfWeek dayStart, DayOfWeek dayStop, int a, int b){
        this.weekDayStart = dayStart;
        this.weekDayStop = dayStop;
        this.DayHourStart = a;
        this.DayHourStop = b;

    }
    boolean isInSchedule(LocalDateTime day ) {
      int db = this.weekDayStart.getValue();
      int de = this.weekDayStop.getValue();
      int cd = day.getDayOfWeek().getValue();
        return cd >= db && cd <= de;
    }
}

