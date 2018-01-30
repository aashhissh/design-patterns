package creational_patterns.builder_design_pattern.pizza_hut.pizza.non_veg;

import creational_patterns.builder_design_pattern.pizza_hut.pizza.Pizza;

public abstract class NonVegPizza extends Pizza {
    @Override
    public abstract float price();
    @Override
    public abstract String name();
    @Override
    public abstract String size();
}
