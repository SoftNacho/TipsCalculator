import java.util.*;

public class TipsCalc {
    public static void main(String[] args){
        Scanner myScanDouble = new Scanner(System.in);
        double subtotal;
        double rate;
        double gratuity;
        double total;

        System.out.print("Enter the subtotal and the rate: ");
        subtotal = myScanDouble.nextDouble();
        rate = myScanDouble.nextDouble();

        gratuity = subtotal * rate / 100;
        total = subtotal + gratuity;

        System.out.println("The gratuity is $" + String.format("%.2f", gratuity) + " and the total is $" + String.format("%.2f", total) + ".");
    }//end of main
}//end of class
