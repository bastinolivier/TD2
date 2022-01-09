package city;

import java.time.LocalDateTime;
import java.util.Date;

public class Male extends Human{
    public Male(String firstname, String lastname,
                Date birth, Stateenum stateenum, Schedule schedule, Contract contract) {
        super(firstname, lastname, birth,  stateenum, schedule, contract);
    }

    public Male(String firstname, String lastname, Date birth) {
        super(firstname, lastname, birth);
    }

    @Override
    public void tick(LocalDateTime a) {
        int max = 31557600;
        int min = 1;
        int range = max - min + 1;
        int result = (int)(Math.random() * range) + min;
        if(this.stateenum == Stateenum.Home && this.workingContract.schedule.isInSchedule(a)){
            stateenum = Stateenum.Work;
        } else if (!this.family.isAlone(family.male) && family.female.stateenum.toString().equals(Stateenum.Home) && result == 42){
            family.female.pregnant = true;
        } else {
            stateenum = Stateenum.Home;
        }
    }
}
