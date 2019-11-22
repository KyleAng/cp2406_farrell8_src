import java.util.Scanner;
public class Dollars {
    public static void main(String[] args){
        int dollars;
        int no_20notes;
        int no_10notes;
        int no_5notes;
        int no_1notes;
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter the number of dollars: ");
        dollars = user_input.nextInt();
        no_20notes = dollars/20;
        dollars = dollars - no_20notes*20;
        no_10notes = dollars/10;
        dollars = dollars - no_10notes*10;
        no_5notes = dollars/5;
        dollars = dollars - no_5notes*5;
        no_1notes = dollars;
        System.out.println(no_20notes + " 20s");
        System.out.println(no_10notes + " 10s");
        System.out.println(no_5notes + " 5s");
        System.out.println(no_1notes + " 1s");

    }
}
