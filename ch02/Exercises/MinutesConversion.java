import java.util.Scanner;
import java.lang.Math;
public class MinutesConversion {
    public static void main(String[] args){
        double days;
        double hours;
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter number of minutes: ");
        double minutes = Double.parseDouble(user_input.nextLine());
        hours = Math.round(minutes/60 * 1000.0)/1000.0;
        days = Math.round(hours/24 * 1000.0) / 1000.0;
        System.out.println(minutes + " equals " + hours + " Hours and equals " + days + " Days ");
    }
}
