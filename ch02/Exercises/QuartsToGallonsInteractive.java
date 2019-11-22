import javax.swing.JOptionPane;

public class QuartsToGallonsInteractive
{
    public static void main(String[] args){
        final int quartsingallon = 4;
        int quartsneeded;
        quartsneeded = Integer.parseInt(JOptionPane.showInputDialog(null, "Quarts needed for paint job?"));
        System.out.print("Job requires " + quartsneeded/4 + " Gallons ");
        if (quartsneeded % quartsingallon != 0)
            System.out.println("plus " + quartsneeded%quartsingallon + " quarts");
    }
}
