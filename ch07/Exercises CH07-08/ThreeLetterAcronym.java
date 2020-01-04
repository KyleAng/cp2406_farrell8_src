import javax.swing.*;
import java.util.ArrayList;

public class ThreeLetterAcronym {
    public static void main(String[] args){
        String words = JOptionPane.showInputDialog(null, "Enter your three letter acronym");
        int stop = 0;
        String word = "";
        ArrayList<String> TLA = new ArrayList<String>();
        words += " ";
        for(int x=0; x<words.length(); x++){
            Character c = words.charAt(x);

            if(TLA.size() == 3){
                break;
            }

            else if(!(Character.isAlphabetic(c) || Character.isDigit(c)) && (word.trim().length() > 0)){
                TLA.add(word);
                word = "";
            }
            else{
                word += c;
            }
        }
        String acronym = "";
        for(int j=0; j<TLA.size(); j++){
            String theword = TLA.get(j).toUpperCase();

            acronym += theword.charAt(0);
        }
        System.out.println(acronym);

    }
}
