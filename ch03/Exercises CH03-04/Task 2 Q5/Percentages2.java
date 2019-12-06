import java.util.Scanner;
public class Percentages2 extends Percentages{
    public static void main(String[] args){
        double variable1;
        double variable2;
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter the first variable: ");
        variable1 = user_input.nextDouble();
        System.out.print("Enter the second variable: ");
        variable2 = user_input.nextDouble();
        System.out.println(variable1 + " is " + computePercent(variable1, variable2) + " percent of " + variable2);
        System.out.println(variable2 + " is " + computePercent(variable2, variable1) + " percent of " + variable1);
        user_input.close();
    }
}
