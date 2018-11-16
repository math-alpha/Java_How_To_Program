public class Chap8_ModifiedTimeClassTest {
        public static void main(String[] args)
        {
            Chap8_ModifiedTimeClass t1 = new Chap8_ModifiedTimeClass(); // 00:00:00
            Chap8_ModifiedTimeClass t2 = new Chap8_ModifiedTimeClass(2); // 02:00:00
            Chap8_ModifiedTimeClass t3 = new Chap8_ModifiedTimeClass(21, 34); // 21:34:00
            Chap8_ModifiedTimeClass t4 = new Chap8_ModifiedTimeClass(12, 25, 42); // 12:25:42
            Chap8_ModifiedTimeClass t5 = new Chap8_ModifiedTimeClass(t4); // 12:25:42

            System.out.println("Constructed with:");
            displayTime("t1: all default arguments", t1);
            displayTime("t2: hour specified; default minute and second", t2);
            displayTime("t3: hour and minute specified; default second", t3);
            displayTime("t4: hour, minute and second specified", t4);
            displayTime("t5: Chap8_ModifiedTimeClass object t4 specified", t5);

            // attempt to initialize t6 with invalid values
            try
            {
                Chap8_ModifiedTimeClass t6 = new Chap8_ModifiedTimeClass(27, 74, 99); // invalid values
            }
            catch (IllegalArgumentException e)
            {
                System.out.printf("%nException while initializing t6: %s%n", e.getMessage());
            }
        }

        // displays a Chap8_ModifiedTimeClass object in 24-hour and 12-hour formats
        private static void displayTime(String header, Chap8_ModifiedTimeClass t)
        {
            System.out.printf("%s%n   %s%n   %s%n", header, t.toUniversalString(), t.toString());
        }
}
