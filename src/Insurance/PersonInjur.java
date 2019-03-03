package Insurance;

public class PersonInjur implements AutoInsurance {
    private String information;
    @Override
    public String getInfo() {
        information="If an accident occurs which causes the personal injury or death of the driver of the" +
                " vehicle, the insurance company shall indemnify the driver according to the provisions hereof.";
        return information;
    }
}
