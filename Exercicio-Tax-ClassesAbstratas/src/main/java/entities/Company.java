package entities;

public class Company extends TaxPayer {

    private Integer numberEmployees;

    public Company(){
        super();
    }

    public Company(String name, Double annualIncome, Integer numberEmployees) {
        super(name, annualIncome);
        this.numberEmployees = numberEmployees;
    }

    public Integer getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(Integer numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    @Override
    public double tax(){
        double basicTax;
        if(numberEmployees < 10){
            basicTax = getAnnualIncome() * 0.16;
        }else {
             basicTax = getAnnualIncome() * 0.14;
        }
        return basicTax;
    }

}
