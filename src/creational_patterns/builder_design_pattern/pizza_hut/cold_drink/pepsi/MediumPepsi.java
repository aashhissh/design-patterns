package creational_patterns.builder_design_pattern.pizza_hut.cold_drink.pepsi;

public class MediumPepsi extends Pepsi {

    @Override
    public String name() {
        return "500 ml Pepsi";
    }

    @Override
    public String size() {
        return "Medium Size";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
