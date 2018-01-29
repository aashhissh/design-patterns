package creational_patterns.abstract_factory_pattern.bank;

import creational_patterns.abstract_factory_pattern.AbstractFactory;
import creational_patterns.abstract_factory_pattern.loan.Loan;

public class BankFactory extends AbstractFactory {
    @Override
    public Bank getBank(String bank) {
        if(bank == null){
            return null;
        }
        if(bank.equalsIgnoreCase("HDFC")){
            return new HDFC();
        } else if(bank.equalsIgnoreCase("ICICI")){
            return new ICICI();
        } else if(bank.equalsIgnoreCase("SBI")){
            return new SBI();
        }
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        return null;
    }
}
