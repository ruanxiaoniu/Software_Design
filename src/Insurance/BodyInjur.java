package Insurance;

public class BodyInjur implements AutoInsurance {
    private String information;
    @Override
    public String getInfo() {
        information="In the event of an insured event, we may indemnify you on your behalf " +
                "against the loss suffered by a third party (person or thing) in accordance with " +
                "the terms and conditions. For example, if you have the misfortune to crash someone's " +
                "car or drive a car to cause casualties, the insurance company will compensate according to " +
                "the provisions.\n"+"the maximum compensation for compulsory insurance is 122,000" +
                " yuan, while the compensation may be up to several hundred thousand yuan if the accident happens " +
                "to hit a luxury car or cause serious injury to a person. The third party liability insurance is " +
                "insured, and the insurance company will compensate for the insufficient part of compulsory " +
                "insurance. [2] considering the current actual situation, it is suggested to choose 500,000-1 " +
                "million as the guarantee quota.";
        return information;
    }
}
