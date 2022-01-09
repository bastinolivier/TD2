package city;

import java.time.LocalDateTime;
import java.util.Date;

public class Child extends Human{
    public Child(String firstname, String lastname, Date birth) {
        super(firstname, lastname, birth);
    }

    @Override
    public void tick(LocalDateTime a) {

    }
}
