package creational_patterns.builder_design_pattern.pizza_hut.pizza.veg.onion;

import creational_patterns.builder_design_pattern.pizza_hut.pizza.veg.VegPizza;

public class ExtraLargeOnionPizza extends VegPizza {
    @Override
    public float price() {
        return 200.0f;
    }
    @Override
    public String name() {
        return  "Onion Pizza";
    }
    @Override
    public String size() {
        return  "Extra-Large Size";
    }
}
