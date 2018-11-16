public class Chap8_SavingsAccount {

    private static double annualInterestRate;
    private double savingsBalance;

    public Chap8_SavingsAccount(double saving){
        this.savingsBalance = saving;
    }

    public double  calculateMonthlyInterest(){
        return  savingsBalance * annualInterestRate / 12;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static void modifyInterestRate(double interest){
        annualInterestRate = interest;
    }

}
