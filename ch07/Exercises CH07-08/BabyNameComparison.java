import javax.swing.*;
import java.util.*;

public class BabyNameComparison {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> namecombos = new ArrayList<String>();
        for(int x = 0; x < 3; x++){
            String name = JOptionPane.showInputDialog(null, "Enter name #" + (x+1) + ":");
            names.add(name);
        }
        for(int j = 0; j < names.size(); j++){
            if(j <= 1){
                namecombos.add(names.get(j) + names.get(j));
                namecombos.add(names.get(j) + names.get(j + 1));
                namecombos.add(names.get(j+1) + names.get(j));
            }

            else if(j == 2){
                namecombos.add(names.get(j) + names.get(j));
                namecombos.add(names.get(j) + names.get(0));
                namecombos.add(names.get(0) + names.get(j));
            }

        }
        for(int i = 0; i < namecombos.size(); i++){
            System.out.println("Name: " + namecombos.get(i));
        }
    }
}
