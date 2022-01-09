package city;

import java.math.BigDecimal;

class Wallet {
    protected BigDecimal cash;

    public Wallet(long cash) {
        this.cash = new BigDecimal(cash);
    }

    public Boolean pay(long cash) {
        if (this.cash.subtract(new BigDecimal(cash)).signum() != -1) {
            this.cash = this.cash.subtract(new BigDecimal(cash));
            return true;
        }
        return false;
    }

    public void add(long e) {
        this.cash = this.cash.add(new BigDecimal(e));
    }
}






