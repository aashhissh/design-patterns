package creational_patterns.builder_design_pattern.pizza_hut.pizza.veg;

import creational_patterns.builder_design_pattern.pizza_hut.pizza.Pizza;

public abstract class VegPizza extends Pizza {
    @Override
    public abstract float price();
    @Override
    public abstract  String name();
    @Override
    public abstract  String size();
}
