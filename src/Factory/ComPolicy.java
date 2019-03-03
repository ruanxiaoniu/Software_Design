package Factory;

import Insurance.AutoInsurance;
import Insurance.Com;

public class ComPolicy implements PolicyProducer {
    @Override
    public AutoInsurance getInsureObj() {
        return new Com();
    }
}
