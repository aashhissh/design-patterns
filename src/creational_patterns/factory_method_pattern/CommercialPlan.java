package creational_patterns.factory_method_pattern;

public class CommercialPlan extends Plan {

    @Override
    public void getRate() {
        rate = 7.50;
    }

}
