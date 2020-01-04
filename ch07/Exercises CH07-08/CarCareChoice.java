
import javax.swing.*;
import java.util.*;

public class CarCareChoice {
    public static void main(String[] args){
        Map<String, Double> choice = new HashMap<String, Double>();
        choice.put("oil change", 25.0);
        choice.put("tire rotation", 22.0);
        choice.put("battery check", 15.0);
        choice.put("brake inspection", 5.0);
        String Option = JOptionPane.showInputDialog(null, "Choose service: ");
        if(choice.get(Option) == null){
            System.out.println("Does not exist");
        }
        else{
            System.out.println("$" + choice.get(Option));
        }

    }
}
