package creational_patterns.builder_design_pattern.pizza_hut.pizza.non_veg;

public class ExtraLargeNonVegPizza extends NonVegPizza {
    @Override
    public float price() {
        return 250.0f;
    }

    @Override
    public String name() {
        return "Non-Veg Pizza";
    }

    @Override
    public String size() {
        return "Extra-Large Size";
    }
}
