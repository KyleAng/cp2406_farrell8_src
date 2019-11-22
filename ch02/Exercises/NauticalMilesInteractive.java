import javax.swing.JOptionPane;
public class NauticalMilesInteractive {
    public static void main(String[] args){
        final double no_of_kilometers = 1.852;
        final double no_of_miles = 1.150779;
        double nauticalMiles;
        nauticalMiles = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter nautical miles"));
        System.out.println(nauticalMiles + " nautical miles in kilometers: " + nauticalMiles*no_of_kilometers);
        System.out.println(nauticalMiles + " nautical miles in miles: " + nauticalMiles*no_of_miles);
    }

}
