package Insurance;

public class LuxuryCar implements AutoInsurance {
    private String information;
    @Override
    public String getInfo() {
        information="After insurance accident happens, insurance company can calculate the deductible amount that" +
                " should assume by insurant proper place by the clause";
        return information;
    }
}
