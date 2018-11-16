import java.util.*;

class  FindSmallestValue{
	
     public static void main(String[] args) {
     	
          Scanner input = new Scanner(System.in);

          System.out.println("Please enter the number of intergers you want to examine: ");
          int number = input.nextInt();
         int[] array = new int[number];

          for (int i = 0; i < number ; i++ ) {
          	  System.out.println("Enter the "+i+"number: ");
          	  number = input.nextInt();
          	  array[i] = number; 
          }

          Arrays.sort(array);

          System.out.println(array[0]);
          System.out.println();

     }

}