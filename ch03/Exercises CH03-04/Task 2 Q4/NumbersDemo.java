import java.lang.Math.*;
public class NumbersDemo {

    public static void main(String[] args){
        int variable1 = 5;
        int variable2 = 10;
        System.out.println("Twice the numbers:");
        System.out.println(displayTwiceTheNumber(variable1));
        System.out.println(displayTwiceTheNumber(variable2));

        System.out.println("Numbers plus five:");
        System.out.println(displayNumberPlusFive(variable1));
        System.out.println(displayNumberPlusFive(variable2));

        System.out.println("Numbers squared:");
        System.out.println(displayNumberSquared(variable1));
        System.out.println(displayNumberSquared(variable2));
    }

    public static int displayTwiceTheNumber(int var){
        return var*2;
    }

    public static int displayNumberPlusFive(int var){
        return var + 5;
    }

    public static double displayNumberSquared(int var){
        return Math.pow(var, 2);
    }
}
