package creational_patterns.builder_design_pattern.cd;

public class Sony extends Company{
    @Override
    public int price(){
        return 20;
    }
    @Override
    public String pack(){
        return "Sony CD";
    }
}
