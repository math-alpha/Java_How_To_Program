import java.util.Scanner;
import java.util.ArrayList;

class Chap7_polling{

    public static void main(String[] args){

        ArrayList<String> topics = new ArrayList<String>();//{"Corruption","Tribalism","Terrorism","Pollution","Injustice"};

        topics.add("Corruption");
        topics.add("Tribalism");
        topics.add("Terrorism");
        topics.add("Pollution");
        topics.add("Injustice");

        Scanner input = new Scanner(System.in);

        /*
        int[][] responses = new int[5][];
        responses[0] = new int[10];
        responses[1] = new int[10];
        responses[2] = new int[10];
        responses[3] = new int[10];
        responses[4] = new int[10];
        */

        int[][] responses = new int[5][10];


        System.out.println("You will be given five topics and you are demanded to give a rating\n Choose in the scale 1 - 10 (From least to most important)\n");

        int location = 0;

        do{

            for(int i = 0; i < 5; i++ ){

                 System.out.println("For the issue "+topics.get(i)+". What's your rating ?\nRATE (from 1-10):");
                 location = input.nextInt();

                 if(location >= 0 && location <= 10){
                    ++responses[i][location-1];
                 } else if (location == -1){
                     break;
                 } else{
                     --i;
                     continue;
                 }

            }

        }while(location != -1);

        System.out.printf("%n\t\tRESULTS STATISTCS%n%n");

        for (int i = 0; i < 5; i++) {
            System.out.printf("| %11s |",topics.get(i));
            for (int j = 0; j < 10; j++) {
                System.out.printf("%s%d%s", (j == 0) ? " " : "", responses[i][j], (j != 9) ? " " : " |\n");
            }
        }
    }
}