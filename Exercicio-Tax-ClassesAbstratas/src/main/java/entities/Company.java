package entities;

public class Company extends Tax {

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
        if(this.numberEmployees < 10){
            return  getAnnualIncome() * 14 /100;
        }else {
             return getAnnualIncome() * 16 /100;
        }
    }

}
