package city;

import java.time.LocalDateTime;
import java.util.List;

public interface State {
    List<Human>getTickable();
    long registerHuman(Human human);
    void CreateFamily(Male male, Female female);
    String getRandomName(int n);
    LocalDateTime getRandomDate();
    void generateFamilies(int n);
    void generateCompanies(int n);
    void generateEmployees(int n);
    Human richestHuman();
}
