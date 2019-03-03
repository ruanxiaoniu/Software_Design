package Factory;

import Insurance.AutoInsurance;
import Insurance.Property;

public class PropertyPolicy implements PolicyProducer {
    @Override
    public AutoInsurance getInsureObj() {
        return new Property();
    }
}
