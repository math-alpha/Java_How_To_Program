import java.util.Scanner;

class CalculatingSales
{
	
   Scanner input = new Scanner(System.in);

   float num, qty, total = ret1 = ret3 = ret4 = ret5 = 0.0;


   for (int i == 1; ; i++ ) {

   	if (i%10 == 0) {
   		System.out.print("\nSentinel controlled loop(press \"q\" to exit)\n");
   	}

   System.out.println("Enter product number: ");
   int num = input.nextInt();
   if(num <= 0 || num > 5){
   	continue;
   } else if (num == 'q') {
   	 break;
   }
   System.out.println("Enter quantity sold: ");
   int qty = input.nextInt();
   if (qty < 0) {
    	continue;
    } 

   switch (num) {
    case 1:
        ret1  += (qty * 2.98);
        total += (qty * 2.98);
        break; 
    case 2:
        total += (qty * 4.50);
        ret2  += (qty * 4.50);
        break; 
    case 3:
        total += (qty * 9.98);
        ret3  += (qty * 9.98);
        break; 
    case 4:
        total += (qty * 4.49);
        ret4  += (qty * 4.49);
        break;
    case 5:
        total += (qty * 6.87);
        ret5  += (qty * 6.87);
        break;  
    default:
      break;
   }

   }
}