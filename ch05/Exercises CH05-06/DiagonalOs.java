import javax.swing.*;

public class DiagonalOs {
    public static void main(String[] args){
        final char o = 'O';
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of Os "));
        out(o, num);
    }

    public static void out(char o, int limit){
        String gap = "";
        for(int i = 0; i < limit; i++){
            System.out.println(gap + o);
            gap += " ";
        }

    }
}
