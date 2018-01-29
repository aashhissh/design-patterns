package creational_patterns.abstract_factory_pattern;

import creational_patterns.abstract_factory_pattern.bank.Bank;
import creational_patterns.abstract_factory_pattern.loan.Loan;

public abstract class AbstractFactory {
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}
