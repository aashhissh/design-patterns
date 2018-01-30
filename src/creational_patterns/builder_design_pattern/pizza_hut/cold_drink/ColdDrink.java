package creational_patterns.builder_design_pattern.pizza_hut.cold_drink;

import creational_patterns.builder_design_pattern.pizza_hut.Item;

public abstract class ColdDrink implements Item {
    @Override
    public abstract float price();
}
