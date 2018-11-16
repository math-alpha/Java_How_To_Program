/**
* Question not well understood
*/

public class IntegerSet {

    private static boolean[] a = new boolean[101];

    IntegerSet(){
        for (int i = 0; i < a.length; i++) {
            a[i] = false;
        }
    }

    IntegerSet(int number){
        if (number >= 0 && number <= 100)
            a[number] = true;
        else
            throw new IndexOutOfBoundsException("Number should be in the range 0-100");
    }

    IntegerSet(int... number){
        for(int i : number){
            if (i >= 0 && i <= 100)
                a[i] = true;
            else
                throw new IndexOutOfBoundsException("Number should be in the range 0-100");
        }
    }

    public static void union(){
    }

    public static void intersection(){
    }

    public void insertElement(int k){
        a[k] = true;
    }

    public void deleteElement(int k){
        a[k] = false;
    }

    public void isEqualTo(IntegerSet x, IntegerSet y){
    }

    public String toString(){
        String returnString = " ";
        String emptyString = "---";
        int count = 0;
        for (int i = 0; i < 100; i++) {
            if(a[i] == true){
                returnString += a[i] + " ";
                ++count;
            }
        }
        return String.format("%s",count == 0 ? emptyString : returnString);
    }

}
