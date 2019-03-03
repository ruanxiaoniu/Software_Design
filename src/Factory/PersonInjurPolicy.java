package Factory;

import Insurance.AutoInsurance;
import Insurance.PersonInjur;

public class PersonInjurPolicy implements PolicyProducer {
    @Override
    public AutoInsurance getInsureObj() {
        return new PersonInjur();
    }
}
