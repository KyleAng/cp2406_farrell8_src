import javax.swing.*;
public class CellPhoneService {
    public static void main(String[] args){
        Integer talk_minutes_used = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the maximum number of minutes you're going to use"));
        Integer text_sent = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the maximum number of text you're going to send"));
        Integer gigabytes_of_data = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the maximum number of gigabytes of data you're going to use"));
        System.out.println(plan(talk_minutes_used, text_sent, gigabytes_of_data));
    }

    public static String plan(Integer talk, Integer text, Integer data){
        if(talk < 500 && text.equals(0) && data.equals(0) ) {
            return "Plan A";
        }
        else if(talk < 500 && text > 0 && data.equals(0)){
            return "Plan B";
        }
        else if(talk >= 500 && text <= 100 && data.equals(0)){
            return "Plan C";
        }
        else if(talk >= 500 && text > 100 && data.equals(0)){
            return "Plan D";
        }
        else if(data > 0 && data <= 2){
            return "Plan E";
        }
        else{
            return "Plan F";
        }

    }
}

