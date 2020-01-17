import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JBookQuote2 extends JFrame implements ActionListener {
    protected JButton my_quote = new JButton("Press me");
    protected  JLabel quote = new JLabel("The quote");
    //JFrame bookbut = new JFrame("My Book Quote Button");
    protected Font my_font = new Font("Calibri", Font.PLAIN, 18);

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JBookQuote2 frame = new JBookQuote2();
                frame.setVisible(true);
            }
        });
    }

    public JBookQuote2(){
        super("My book Quote Button");
        setSize(200, 600);
        quote.setFont(my_font);
        setLayout(new BorderLayout());
        //bookbut.add(quote);
        add(my_quote, BorderLayout.NORTH);
        add(quote, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        my_quote.addActionListener(this);
        //bookbut.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        quote.setText("This is the right quote");
    }
}
