import java.math.BigDecimal;
import java.util.Scanner;
public class ChiliToGoProfit {
    public static void main(String[] args){
        final BigDecimal adult_chili = new BigDecimal("7.00");
        final BigDecimal kid_chili = new BigDecimal("4.00");
        final BigDecimal produce_adult_chili = new BigDecimal("4.35");
        final BigDecimal produce_kid_chili = new BigDecimal("3.10");
        BigDecimal no_adult_meals;
        BigDecimal no_child_meals;
        System.out.println("Profit for an adult meal is $" + (adult_chili.subtract(produce_adult_chili) ));
        System.out.println("Profit for a kid meal is $" + (kid_chili.subtract(produce_kid_chili)) );
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter number of adult meals: ");
        no_adult_meals = new BigDecimal(user_input.nextLine());
        System.out.print("Enter number of kids meals: ");
        no_child_meals = new BigDecimal(user_input.nextLine());
        BigDecimal adult_revenue = new BigDecimal(String.valueOf(adult_chili.multiply(no_adult_meals)));
        BigDecimal kid_revenue = new BigDecimal(String.valueOf(kid_chili.multiply(no_child_meals)));
        BigDecimal adult_profit = new BigDecimal(String.valueOf(adult_chili.multiply(no_adult_meals).subtract(produce_adult_chili.multiply(no_adult_meals))));
        BigDecimal kid_profit = new BigDecimal(String.valueOf(kid_chili.multiply(no_child_meals).subtract(produce_kid_chili.multiply(no_child_meals))));
        System.out.println("Revenue from adult meals: $" + adult_revenue);
        System.out.println("Profit from adult meals: $" + adult_profit);
        System.out.println("Revenue from kid meals: $" + kid_revenue);
        System.out.println("Profit from kid meals: $" + kid_profit);
        System.out.println("Total Revenue: $" + kid_revenue.add(adult_revenue));
        System.out.println("Total Profit: $" + kid_profit.add(adult_profit));
    }
}
