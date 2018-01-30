package creational_patterns.builder_design_pattern.pizza_hut.pizza.veg.cheese;

import creational_patterns.builder_design_pattern.pizza_hut.pizza.veg.VegPizza;

public class MediumCheesePizza extends VegPizza {
    @Override
    public float price() {
        return 120.0f;
    }

    @Override
    public String name() {
        return  "Masala Pizza";
    }

    @Override
    public String size() {
        return  "Medium Size";
    }
}
