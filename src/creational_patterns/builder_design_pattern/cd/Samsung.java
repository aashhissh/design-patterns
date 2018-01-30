package creational_patterns.builder_design_pattern.cd;

public class Samsung extends Company {
    @Override
    public int price(){
        return 15;
    }
    @Override
    public String pack(){
        return "Samsung CD";
    }
}
