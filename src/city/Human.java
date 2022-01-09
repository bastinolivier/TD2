package city;

import java.util.Date;

public abstract class Human implements Payable,Tickable {

    private static Integer id = 0;
    public Schedule schedule;
    public final String firstname;
    public final String lastname;
    public final Date birth;
    public Family family;
    public Stateenum stateenum;
    public Contract workingContract;
    private Wallet wallet;

    public Human(String firstname, String lastname, Date birth) {
        id += 1;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birth = birth;
        this.wallet = new Wallet(0);
    }

    public Contract getWorkingContract() {
        return workingContract;
    }

    public Human(String firstname, String lastname, Date birth,
                 Stateenum stateenum, Schedule schedule , Contract contract){
        id += 1;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birth = birth;
        this.stateenum = stateenum;
        this.schedule = schedule;
        this.workingContract = contract;
        this.wallet = new Wallet(0);
    }

    @Override
    public void getPaid(long x) {
        this.wallet.add(x);
    }
}
