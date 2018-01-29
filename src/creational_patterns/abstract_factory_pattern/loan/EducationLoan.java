package creational_patterns.abstract_factory_pattern.loan;

public class EducationLoan extends Loan {
    @Override
    public void getInterestRate(double r) {
        rate=r;
    }
}
