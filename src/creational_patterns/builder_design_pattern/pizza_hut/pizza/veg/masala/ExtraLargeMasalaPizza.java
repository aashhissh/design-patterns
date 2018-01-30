package creational_patterns.builder_design_pattern.pizza_hut.pizza.veg.masala;

import creational_patterns.builder_design_pattern.pizza_hut.pizza.veg.VegPizza;

public class ExtraLargeMasalaPizza extends VegPizza {
    @Override
    public float price() {
        return 180.0f;
    }

    @Override
    public String name() {
        return  "Masala Pizza";
    }

    @Override
    public String size() {
        return  "Extra-Large Size";
    }
}
