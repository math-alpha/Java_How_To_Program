public class Chap8_ModifiedDateTest {

    public static void main(String[] args){

        Chap8_ModifiedDate date = new Chap8_ModifiedDate(12,1,1999);

        for (int i = 0; i < 60; i++) {
            System.out.print("Date : "+date.toString()+"\n");
            date.nextDay();
        }

    }

}
