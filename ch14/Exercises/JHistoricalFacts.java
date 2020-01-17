import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JHistoricalFacts extends JFrame implements ActionListener {
    protected JButton display_label = new JButton("Press me");
    protected JLabel label1 = new JLabel("Fact 1");
    protected JLabel label2 = new JLabel("Fact 2");
    protected JLabel label3 = new JLabel("Fact 3");
    protected JLabel label4 = new JLabel("Fact 4");
    protected JLabel label5 = new JLabel("Fact 5");
    protected JLabel[] labels = new JLabel[5];
    int count = 1;
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JHistoricalFacts frame = new JHistoricalFacts();
                frame.setVisible(true);
            }
        });
    }

    public JHistoricalFacts(){
        super("Straight-up Facts");
        add(display_label);
        labels[0] = label1;
        labels[1] = label2;
        labels[2] = label3;
        labels[3] = label4;
        labels[4] = label5;
        add(labels[0]).setVisible(true);
        for(int i = 1; i < labels.length; i++){
            add(labels[i]).setVisible(false);
        }
        display_label.addActionListener(this);
        setLayout(new FlowLayout());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(count == 5){
            labels[4].setVisible(false);
            labels[0].setVisible(true);
            count = 1;
        }
        else{
            labels[count - 1].setVisible(false);
            labels[count].setVisible(true);
            count++;
        }

    }
}
