package creational_patterns.builder_design_pattern.pizza_hut.pizza.veg.cheese;

import creational_patterns.builder_design_pattern.pizza_hut.pizza.veg.VegPizza;

public class SmallCheesePizza extends VegPizza {
    @Override
    public float price() {
        return 100.0f;
    }
    @Override
    public String name() {
        return  "Masala Pizza";
    }
    @Override
    public String size() {
        return  "Samll Size";
    }
}
