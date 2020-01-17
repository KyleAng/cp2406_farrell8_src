import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTVDownload extends JFrame implements ActionListener {
    protected JButton[] shows = new JButton[5];
    protected JLabel label = new JLabel("A brief Synopsis");

    //int count = 0;

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JTVDownload frame = new JTVDownload();
                frame.setVisible(true);
            }
        });
    }
    public JTVDownload(){
        super("Television Shows");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 600);
        setLayout(new BorderLayout());
        JPanel main = new JPanel();
        add(main, BorderLayout.CENTER);
        for(int i = 0; i < shows.length - 1; i++){
            shows[i] = new JButton(("This is TV show #" + i));
            //labels[i] = new JLabel("");
            shows[i].setActionCommand(Integer.toString(i));
            shows[i].addActionListener(this);
            shows[i].setHorizontalAlignment(SwingConstants.HORIZONTAL);
            main.add(shows[i]);
            //add(labels[i]);
        }
        label.setHorizontalAlignment(SwingConstants.CENTER);
        //setLayout(new BorderLayout());
        main.add(label, BorderLayout.SOUTH);

    }

    public void actionPerformed(ActionEvent e){
        String command = e.getActionCommand();
        System.out.println(command);
        if(command.equals("0")){
            label.setText("<html> This is a bu hao tv show </html>");
        }

        if(command.equals("1")){
            label.setText("<html> This is a hen hao tv show </html>");
        }

        if(command.equals("2")){
            label.setText("<html> This is a ke yi tv show </html>");
        }

        if(command.equals("3")){
            label.setText("<html> This is a hen ri tv show </html>");
        }




        //source.setText(" A breif synopsis");
    }
}
