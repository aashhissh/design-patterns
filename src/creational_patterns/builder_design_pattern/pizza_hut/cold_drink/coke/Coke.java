package creational_patterns.builder_design_pattern.pizza_hut.cold_drink.coke;

import creational_patterns.builder_design_pattern.pizza_hut.cold_drink.ColdDrink;

public abstract class Coke extends ColdDrink {

    @Override
    public abstract  String name();

    @Override
    public abstract  String size();

    @Override
    public abstract  float price();

}
