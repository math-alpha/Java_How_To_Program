public class Chap9_BasePlusCommissionEmployeeTest {
    public static void main(String[] args){
        Chap9_CommissionEmployee commissionEmployee = new Chap9_CommissionEmployee("Ngadou", "Ronald", "333-33-3333", 50000, .04);
        Chap9_BasePlusCommissionEmployee employ = new Chap9_BasePlusCommissionEmployee(4000.0,commissionEmployee);

        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s %s%n", "First name is", employ.employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is", employ.employee.getLastName());
        System.out.printf("%s %s%n", "Social security number is", employ.employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is", employ.employee.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is", employ.employee.getCommissionRate());
        System.out.printf("%s %.2f%n", "Base salary is", employ.getBaseSalary());

        employ.setBaseSalary(100000);

        System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString", employ.toString());

    }
}
