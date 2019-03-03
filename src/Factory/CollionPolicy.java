package Factory;

import Insurance.AutoInsurance;
import Insurance.Collision;

public class CollionPolicy implements PolicyProducer {
    @Override
    public AutoInsurance getInsureObj() {
        return new Collision();
    }
}
