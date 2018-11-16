public class Chap8_ModifiedDate {

        private int month; // 1-12
        private int day; // 1-31 based on month
        private int year; // any year

        private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // constructor: confirm proper value for month and day given the year
        public Chap8_ModifiedDate(int month, int day, int year) {
            // check if month in range
            if (month <= 0 || month > 12)
                throw new IllegalArgumentException("month (" + month + ") must be 1-12");

            // check if day in range for month
            if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
                throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");

            // check for leap year if month is 2 and day is 29
            if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
                throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");

            this.month = month;
            this.day = day;
            this.year = year;

            System.out.printf("Date object constructor for date %s%n", this);
        }

        public void nextDay(){

            if (day >= daysPerMonth[month]){
                ++this.month;
                this.day = 1;
            }

            if (month > 12){
                ++this.year;
                this.month = 1;
            }

            ++this.day;
        }

        // return a String of the form month/day/year
        public String toString()
        {
            return String.format("%02d/%02d/%d", month, day, year);
        }
}