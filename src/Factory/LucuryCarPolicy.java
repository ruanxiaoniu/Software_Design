package Factory;

import Insurance.AutoInsurance;
import Insurance.LuxuryCar;

public class LucuryCarPolicy implements PolicyProducer {
    @Override
    public AutoInsurance getInsureObj() {
        return new LuxuryCar();
    }
}
