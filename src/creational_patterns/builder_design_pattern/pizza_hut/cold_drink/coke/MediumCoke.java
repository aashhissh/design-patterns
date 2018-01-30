package creational_patterns.builder_design_pattern.pizza_hut.cold_drink.coke;

public class MediumCoke extends Coke{

    @Override
    public String name() {
        return "500 ml Coke";
    }

    @Override
    public String size() {

        return "Medium Size";
    }

    @Override
    public float price() {

        return  35.0f;
    }
}
