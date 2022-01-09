package city;

import java.util.List;

public class Family {

    private String familyName;
    public Male male;
    public Female female;
    public List<Child> childs;

    public Family(Male male) {
        this.male = male;
    }
    public Family(Female female) {
        this.female = female;
    }
    public Family(Male male, Female female) {
        this.male = male;
        this.female = female;
    }
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setMale(Male male) {
        this.male = male;
    }

    public void setFemale(Female female) {
        this.female = female;
    }

    public Male getMale() {
        return male;
    }

    public Female getFemale() {
        return female;
    }

    public boolean isAlone(Male male){
        return female == null;
    }
    public boolean isAlone(Female femal){
        return male == null;
    }
    void addChild(Child child){
        this.childs.add(child);
    }


}
