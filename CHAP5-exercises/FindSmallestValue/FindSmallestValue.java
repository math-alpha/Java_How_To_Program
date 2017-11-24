import java.util.Array;

class int FindSmallestValue{
	
     public static void main(String[] args) {
     	
          Scanner input = new Scanner(Sytem.in);

          int[] array = new int[];

          System.out.println("Please enter the number of intergers you want to examine: ");
          int number = input.nextInt();

          for (int i = 0; i < number ; i++ ) {
          	  System.out.println("Enter the "+i+"number: ");
          	  int number = input.nextInt();
          	  array[i] = number; 
          }

          array = Array.sort(array);

          System.out.println(array[0]);
          System.out.println();

     }

}