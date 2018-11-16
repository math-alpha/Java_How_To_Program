public class Chap8_ModifiedTimeClass1Test {
    public static void main(String[] args)
    {
        Chap8_ModifiedTimeClass1 t1 = new Chap8_ModifiedTimeClass1(); // 00:00:00
        Chap8_ModifiedTimeClass1 t2 = new Chap8_ModifiedTimeClass1(2); // 02:00:00
        Chap8_ModifiedTimeClass1 t3 = new Chap8_ModifiedTimeClass1(20, 59); // 20:59:00
        Chap8_ModifiedTimeClass1 t4 = new Chap8_ModifiedTimeClass1(23, 59, 59); // 23:59:59
        Chap8_ModifiedTimeClass1 t5 = new Chap8_ModifiedTimeClass1(t4);

        t1.tick();
        displayTime("t1: testing method tick", t1);
        t2.incrementHour();
        displayTime("t2: testing method incrementHour ", t2);
        t3.incrementMinute();
        displayTime("t3: testing method incrementMinute from 20:59:00 to 21:00:00 ", t3);
        t4.tick();//t4.tick();t4.tick();t4.tick();t4.tick();
        displayTime("t4: changing day because from 23:59:59 PM to 12:00:00 AM ", t4);

        // attempt to initialize t6 with invalid values
        try
        {
            Chap8_ModifiedTimeClass1 t6 = new Chap8_ModifiedTimeClass1(27, 74, 99); // invalid values
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("%nException while initializing t6: %s%n", e.getMessage());
        }
    }

    // displays a Chap8_ModifiedTimeClass1 object in 24-hour and 12-hour formats
    private static void displayTime(String header, Chap8_ModifiedTimeClass1 t)
    {
        System.out.printf("%s%n   %s%n   %s%n", header, t.toUniversalString(), t.toString());
    }
}
