package city;

import java.time.LocalDateTime;
import java.util.Date;

public class Female extends Human{

    public boolean pregnant;

    public Female(String firstname, String lastname, Date birth, boolean pregnant) {
        super(firstname, lastname, birth);
        this.pregnant = pregnant;
    }

    public Female(String firstname, String lastname, Date birth,
                  Stateenum stateenum, Schedule schedule, Contract contract, boolean pregnant) {
        super(firstname, lastname, birth, stateenum, schedule, contract);
        this.pregnant = pregnant;
    }

    @Override
    public void tick(LocalDateTime a) {
        if(this.stateenum == Stateenum.Home && this.workingContract.schedule.isInSchedule(a)){
            stateenum = Stateenum.Work;
        } else {
            stateenum = Stateenum.Home;
        }

    }

//    protected void checkStatus (State status){
//        return switch(State) {
//
//            case (State.Home && schedule.isInSchedule()) -> ;
//
//            case State.Work -> ;
//
//            case State.Holiday -> ;
//
//            case State.Supermarket -> ;
//
//            default -> "It is none of the known data types";
//
//        }
//    }
}