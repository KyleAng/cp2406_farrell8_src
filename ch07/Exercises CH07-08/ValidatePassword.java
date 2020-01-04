import javax.swing.*;

public class ValidatePassword {
    public static void main(String[] args){
        boolean validpass = false;
        while(!validpass){
            String password = JOptionPane.showInputDialog(null, "Enter your password");
            validpass = validate(password);
            if(validpass == true){
                JOptionPane.showMessageDialog(null, "Your Password is Valid! \nExiting!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid Password! \nTry Again!");
            }
        }

    }

    public static boolean validate(String pass){
        int num_lower = 0;
        int num_upper = 0;
        int num_nums = 0;
        for(int x = 0; x < pass.length(); x++){
            Character c = pass.charAt(x);
            if(Character.isLetter(c) && Character.isUpperCase(c)){
                num_upper++;
            }
            else if(Character.isLetter(c) && Character.isLowerCase(c)){
                num_lower++;
            }

            else if(Character.isDigit(c)){
                num_nums++;
            }
        }
        if(num_lower >= 2 && num_upper >= 2 && num_nums >= 2){
            return true;
        }
        else{
            return false;
        }
    }
}
