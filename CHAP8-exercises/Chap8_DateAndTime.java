public class Chap8_DateAndTime {

    private int hour; // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59
    private int month; // 1-12
    private int day; // 1-31 based on month
    private int year; // any year from 1900

    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


    public Chap8_DateAndTime() {
        this(0, 0, 1900, 0, 0, 0);
    }
    public Chap8_DateAndTime(int month) {
        this(month, 0, 1900, 0, 0, 0);
    }
    public Chap8_DateAndTime(int month, int day) {
        this(month, day, 1900,0,0,0);
    }
    public Chap8_DateAndTime(int month, int day, int year) {
        this(month, day, year,0,0,0);
    }
    public Chap8_DateAndTime(int month, int day, int year, int hour) {
        this(month, day, year,hour,0,0);
    }
    public Chap8_DateAndTime(int month, int day, int year, int hour, int minute) {
        this(month, day, year,hour,minute,0);
    }
    public Chap8_DateAndTime(int month, int day, int year,int hour, int minute, int second) {

        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");

        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");

        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");

        if (month <= 0 || month > 12)
            throw new IllegalArgumentException("month (" + month + ") must be 1-12");

        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");

        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");

        this.month = month;
        this.day = day;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void tick(){
        if (second == 60){
            incrementMinute();
            second = 0;
        } else
            ++second;
    }

    public void incrementMinute(){
        if (minute == 60){
            incrementHour();
            minute = 0;
        } else
            ++minute;
    }

    public void incrementHour(){

        if (hour == 24){
            nextDay();
            hour = 0;
        } else
            ++hour;
    }


    public void nextDay(){

        if (day == daysPerMonth[month]){
            nextMonth();
            day = 1;
        } else
            ++day;
    }

    public void nextMonth(){
        if ( month == 12){
            month = 1;
            ++year;
        } else
            ++month;
    }

    public String toString() {

        if (second == 60) {
            incrementMinute();
            second = 0;
        }

        if (minute == 60) {
            incrementHour();
            minute = 0;
        }

        if (hour == 24){
            hour = 0;
            nextDay();
        }

        return String.format("%02d-%02d-%d %02d:%02d:%02d %s", month, day, year, ((hour == 0 || hour == 12) ? 12 : hour % 12), minute, second, (hour < 12 ? "AM" : "PM"));

    }

}

/*


public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");

        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");

        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");

        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");

        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");

        this.second = second;
    } */
