
import javax.swing.*;
import java.util.*;

public class CarCareChoice2 {
    public static void main(String[] args){
        Map<String, Double> choice = new HashMap<String, Double>();
        choice.put("oil change", 25.0);
        choice.put("tire rotation", 22.0);
        choice.put("battery check", 15.0);
        choice.put("brake inspection", 5.0);
        String Option = JOptionPane.showInputDialog(null, "Choose service: ");
        Option.toLowerCase();
        boolean found = false;
        for( String key: choice.keySet()){
            if(Option.startsWith(key.substring(0,3))){
                System.out.println(choice.get(key));
                found = true;
                break;
            }
        }
        if(found == false){
            System.out.println("Does not exist");
        }
    }
}
