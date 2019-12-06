import javax.swing.*;

public class CountByAnything {
    public static void main(String[] args){
        int count = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number to count by "));
        int limit = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the limit "));
        //Integer step = 0;
        int step = 0;
        for(int i = count; i<= limit; i+= count){
            step++;
            if(step == 10){
                System.out.println(i);
                step = 0;
            }
            else {
                System.out.print(i + " ");
            }
        }
    }
}
