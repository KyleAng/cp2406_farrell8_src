import java.util.Scanner;
public class InchesToFeetInteractive {
    public static void main(String[] args){
        int inches;
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter the inches: ");
        inches = user_input.nextInt();
        System.out.print("In feet: " + inches/12 + " Feet");
        if(inches%12 != 0)
            System.out.println(" And " + inches%12 + " Inches");



    }
}
