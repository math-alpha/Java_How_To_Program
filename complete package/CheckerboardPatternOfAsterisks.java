public class CheckerboardPatternOfAsterisks{

    public static void main(String[] args){
    
        for(int i = 1; i <= 8; i++){
          
            if(i % 2 == 0){
                System.out.println(" ");
            }

            for(int y = 1; y <= 8; y++){
                System.out.println("* ");
            }

        }
    }
  
}
