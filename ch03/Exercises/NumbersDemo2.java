import java.lang.Math.*;
import java.util.Scanner;
public class NumbersDemo2 extends NumbersDemo{

    public static void main(String[] args){
        int variable1;
        int variable2;
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter value for variable 1");
        variable1 = user_input.nextInt();
        System.out.println("Enter value for variable 2");
        variable2 = user_input.nextInt();
        System.out.println("Twice the numbers:");
        System.out.println(displayTwiceTheNumber(variable1));
        System.out.println(displayTwiceTheNumber(variable2));

        System.out.println("Numbers plus five:");
        System.out.println(displayNumberPlusFive(variable1));
        System.out.println(displayNumberPlusFive(variable2));

        System.out.println("Numbers squared:");
        System.out.println(displayNumberSquared(variable1));
        System.out.println(displayNumberSquared(variable2));
        user_input.close();
    }
}
