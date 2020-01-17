import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTVDownload2 extends JFrame implements ActionListener {
    protected JButton[] shows = new JButton[5];
    protected JLabel label = new JLabel("A brief Synopsis");
    protected JTextField enter = new JTextField(20);
    protected JButton submit = new JButton("Submit");
    //int count = 0;

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JTVDownload2 frame = new JTVDownload2();
                frame.setVisible(true);
            }
        });
    }
    public JTVDownload2(){
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
        //submit.setActionCommand(enter.getText());
        submit.addActionListener(this);
        //enter.setActionCommand(enter.getText());
        //enter.addActionListener(this);
        enter.setSize(20, 10);
        enter.setHorizontalAlignment(SwingConstants.CENTER);
        main.add(enter, BorderLayout.SOUTH);
        main.add(submit);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        //setLayout(new BorderLayout());
        add(label, BorderLayout.SOUTH);

    }

    public void actionPerformed(ActionEvent e){
        String command = e.getActionCommand();
        Boolean found = false;
        String textfield = enter.getText();
        System.out.println(command);
        System.out.println(textfield);
        if(command.equals("0")){
            label.setText("<html> This is a bu hao tv show </html>");
        }

        else if(command.equals("1")){
            label.setText("<html> This is a hen hao tv show </html>");
        }

        else if(command.equals("2")){
            label.setText("<html> This is a ke yi tv show </html>");
        }

        else if(command.equals("3")){
            label.setText("<html> This is a hen ri tv show </html>");
        }
        else if (command.equals("Submit")){
            for(int i = 0; i < shows.length - 1; i++){
                System.out.println(shows[i].getText());
                if(textfield.equals(shows[i].getText())){
                    found = true;
                }
            }
            if(found){
                label.setText("<html> Show was found </html>");
            }
            else{
                label.setText("<html> Show was NOT found </html>");
            }
        }





        //source.setText(" A breif synopsis");
    }
}
