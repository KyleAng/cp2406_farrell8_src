import javax.swing.*;
import java.awt.*;
public class JBookQuote {
    public static void main(String[] args){
        JFrame bookq = new JFrame("My Book Quote");
        bookq.setSize(200, 600);
        JLabel quote = new JLabel("Hmmm");
        Font my_font = new Font("Calibri", Font.PLAIN, 18);
        quote.setFont(my_font);
        bookq.add(quote);
        bookq.setVisible(true);
    }

}
