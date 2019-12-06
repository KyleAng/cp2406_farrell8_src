import java.util.Scanner;
import java.util.Calendar;
public class Insurance {
    public static void main(String[] args){
        int birthyear;
        int currentyear = Calendar.getInstance().get(Calendar.YEAR);
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter your birth year ");
        birthyear = user_input.nextInt();
        System.out.println("Insurance for birthyear: " + birthyear + " is: $" +calculate_insurance(birthyear, currentyear));
        user_input.close();

    }

    public static double calculate_insurance(int byear, int cyear){
        final int multiplier = 20;
        final int baseadd = 15;
        double difference_dec = (double) (cyear - byear) / 10;
        System.out.println(difference_dec);
        return (difference_dec + baseadd) * multiplier;

    }

}
