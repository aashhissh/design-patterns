package creational_patterns.builder_design_pattern.pizza_hut.pizza;

import creational_patterns.builder_design_pattern.pizza_hut.Item;

public abstract class Pizza implements Item {
    @Override
    public abstract float price();
}
