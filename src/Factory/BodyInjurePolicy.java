package Factory;

import Insurance.AutoInsurance;
import Insurance.BodyInjur;

public class BodyInjurePolicy implements PolicyProducer {
    @Override
    public AutoInsurance getInsureObj() {
        return new BodyInjur();
    }
}
