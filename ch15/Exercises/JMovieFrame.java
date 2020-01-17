import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMovieFrame extends JFrame implements ActionListener{
    protected String details = "Details of Movie";
    protected JButton ebutton = new JButton("East of Eden");
    protected JButton wbutton = new JButton("West of Wessex");
    protected JButton nbutton = new JButton("Norther than North");
    protected JButton sbutton = new JButton("South of Saint Joel");
    protected JLabel info = new JLabel(details);

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JMovieFrame frame = new JMovieFrame();
                frame.setVisible(true);
            }
        });
    }

    public JMovieFrame(){
        setSize(500, 500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(ebutton, BorderLayout.EAST);
        add(wbutton, BorderLayout.WEST);
        add(nbutton, BorderLayout.NORTH);
        add(sbutton, BorderLayout.SOUTH);
        ebutton.addActionListener(this);
        wbutton.addActionListener(this);
        nbutton.addActionListener(this);
        sbutton.addActionListener(this);
        ebutton.setActionCommand("e");
        wbutton.setActionCommand("w");
        nbutton.setActionCommand("n");
        sbutton.setActionCommand("s");
        add(info, BorderLayout.CENTER);
        info.setHorizontalAlignment(SwingConstants.CENTER);

    }

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("e")){
            details = "Release: 2000, Lead: Mr Ben";
            info.setText(details);
        }
        else if(e.getActionCommand().equals("w")){
            details = "Release: 2010, Lead: Ms Kyaw";
            info.setText(details);
        }
        else if(e.getActionCommand().equals("n")){
            details = "Release: 1985, Lead: Bob";
            info.setText(details);
        }
        else if(e.getActionCommand().equals("s")){
            details = "Release: 2020, Lead: Nyan Toe";
            info.setText(details);
        }

    }

}
