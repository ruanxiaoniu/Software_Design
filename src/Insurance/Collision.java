package Insurance;

public class Collision implements AutoInsurance {
    private String information;
    @Override
    public String getInfo() {
        information="n the event of an insured accident, compensate yourself for the loss of the vehicle. " +
                "Novice road, prone to traffic accidents, strongly recommended to buy. High cost performance, " +
                "saving high maintenance cost.";
        return information;
    }
}
