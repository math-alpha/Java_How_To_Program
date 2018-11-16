public class Chap9_BasePlusCommissionEmployee {

    private double baseSalary;
    public Chap9_CommissionEmployee employee;

    public Chap9_BasePlusCommissionEmployee(double baseSalary, Chap9_CommissionEmployee employee1) {
        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
        this.employee = employee1;
    }

    // set base salary
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
    }

    // return base salary
    public double getBaseSalary() {
        return baseSalary;
    }

    // calculate earnings
    public double earnings() {
        return getBaseSalary() + employee.earnings();
    }

    // return String representation of BasePlusCommissionEmployee
    @Override
    public String toString() {
        return String.format("%s %s%n%s: %.2f", "base-salaried", super.toString(), "base salary", getBaseSalary());
    }
}
