package creational_patterns.abstract_factory_pattern.bank;

public class HDFC implements Bank{
    private final String BNAME;

    public HDFC(){
        BNAME="HDFC BANK";
    }

    public String getBankName() {
        return BNAME;
    }
}
