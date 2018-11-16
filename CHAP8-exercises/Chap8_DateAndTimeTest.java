public class Chap8_DateAndTimeTest {

    public static void main(String[] args){

        Chap8_DateAndTime dateAndTime = new Chap8_DateAndTime(12,31,2018,19,20,20);

        for (int i = 0; i < 10; i++) {
            dateAndTime.tick();
            dateAndTime.incrementMinute();
            dateAndTime.incrementHour();
            System.out.printf("%n%s",dateAndTime.toString());
        }

    }

}
