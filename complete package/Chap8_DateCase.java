/*
*  Using class Chap8_DateAndTime to print date in multiple formats
* */

public class Chap8_DateCase {
    public static void main(String[] args){

        Chap8_DateAndTime date = new Chap8_DateAndTime(10,23,2018,21,58);
        String[] months = {"","January","February","March","April","May","June","July","August","September","October","November","December"};

        System.out.printf("%n%02d/%02d/%02d%n",date.getDay(),date.getMonth(),date.getYear());
        System.out.printf("%s %.3s. %d%n",date.getDay(),months[date.getMonth()],date.getYear());
        System.out.printf("%03d  %d%n",date.getDay(), date.getYear());
    }
}
