package creational_patterns.abstract_factory_pattern;

import creational_patterns.abstract_factory_pattern.AbstractFactory;
import creational_patterns.abstract_factory_pattern.bank.BankFactory;
import creational_patterns.abstract_factory_pattern.loan.LoanFactory;

public class FactoryCreator {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Bank")){
            return new BankFactory();
        } else if(choice.equalsIgnoreCase("Loan")){
            return new LoanFactory();
        }
        return null;
    }
}
