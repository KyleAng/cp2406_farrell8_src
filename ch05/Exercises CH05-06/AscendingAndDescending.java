import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.Collections;

public class AscendingAndDescending {
    public static void main(String[] args){
        Integer[] numbers = new Integer[3];
        for(int i = 0; i < 3; i++){
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number #" + (i+1) + " number"));
        }
        System.out.println("Descending");
        descending(numbers);
        System.out.println("");
        System.out.println("Ascending");
        ascending(numbers);

    }

    public static void ascending(Integer[] arr){
        Arrays.sort(arr);
        for(int val : arr){
            System.out.print(val + ", ");
        }
    }

    public static void descending(Integer[] arr){
        Arrays.sort(arr, Collections.reverseOrder());
        for(int val : arr){
            System.out.print(val + ", ");
        }

    }
}
