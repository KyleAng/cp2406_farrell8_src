import javax.swing.*;
import java.util.ArrayList;
import java.lang.Math;
public class DistanceFromAverage {
    public static void main(String[] args){
        Double number = 0.0;
        ArrayList<Double> my_list = new ArrayList<Double>();
        int count = 0;
        while(number != 99999){
            Double sum = 0.0;
            number = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter number: "));
            if(number != 99999 && count != 20){
                my_list.add(number);
                count++;
            }
            else{
                break;
            }
            for(int i = 0; i < my_list.size(); i++){
                sum += my_list.get(i);
            }
            Double average = sum / my_list.size();
            Double difference = average - number;
            System.out.println("Distance from average " + Math.abs(difference));

        }
    }
}

