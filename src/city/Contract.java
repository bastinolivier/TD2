package city;

public class Contract {
    public Schedule schedule;
    public long pay;


    public Contract(Schedule schedule){
        this.schedule = schedule;
    }

    public Contract(Schedule schedule,long pay){
        this.schedule = schedule;
        this.pay = pay;
    }
}
