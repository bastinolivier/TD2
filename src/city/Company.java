package city;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class Company implements Tickable{
    public String name;
    public static int id = 0;
    public List<Human> employees;
    public Map<Human,Contract> contracts;
    public Map<Human, Long> paid;

    public Company(String name, List<Human> employees, Map<Human, Contract> contracts, Map<Human, Long> paid) {
        id += 1;
        this.name = name;
        this.employees = employees;
        this.contracts = contracts;
        this.paid = paid;
    }
    public void pay(Human human){
       human.getPaid(human.getWorkingContract().pay);
    }
    private void hireEmployee(Human human, Contract contract){
        this.contracts.put(human, contract);
        this.employees.add(human);
    }

    private void fireEmployee(Human human){
        if (contracts.containsKey(human)){
            this.contracts.remove(human);
            this.employees.remove(human);
            System.out.println("Employee is fired");
        } else {
            System.out.println("Employee not exist");
        }
    }

    @Override
    public void tick(LocalDateTime a) {
        employees.forEach(this::pay);
    }
}
