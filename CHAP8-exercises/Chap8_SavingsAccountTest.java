public class Chap8_SavingsAccountTest {

    public static void main(String[] args){

        String[] months = {"JANUARY","FEBUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};

        Chap8_SavingsAccount saver1 = new Chap8_SavingsAccount(2000.00);
        Chap8_SavingsAccount saver2 = new Chap8_SavingsAccount(3000.00);
        Chap8_SavingsAccount.modifyInterestRate(4.0);

        double current = saver1.getSavingsBalance();

        for (int i = 0; i < 12; i++) {
                current += saver1.calculateMonthlyInterest();
                System.out.printf("Month: %10s Savings : %10.3f%n",months[i],current);
        }

        current = saver2.getSavingsBalance();
        System.out.println();

        for (int i = 0; i < 12; i++) {
            current += saver2.calculateMonthlyInterest();
            System.out.printf("Month: %10s Savings : %10.3f%n",months[i],current);
        }

        Chap8_SavingsAccount.modifyInterestRate(5.0);

        current = saver1.getSavingsBalance();

        for (int i = 0; i < 12; i++) {
            current += saver1.calculateMonthlyInterest();
            System.out.printf("Month: %10s Savings : %10.3f%n",months[i],current);
        }

        current = saver2.getSavingsBalance();
        System.out.println();

        for (int i = 0; i < 12; i++) {
            current += saver2.calculateMonthlyInterest();
            System.out.printf("Month: %10s Savings : %10.3f%n",months[i],current);
        }

    }

}
