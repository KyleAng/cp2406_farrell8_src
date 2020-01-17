import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaJuniorCollege extends JFrame implements ActionListener {
    JMenuBar menubar = new JMenuBar();
    JMenu locations = new JMenu("Locations");
    JMenuItem sing = new JMenuItem("Singapore Campus");
    JMenuItem aus = new JMenuItem("Australian Campus");
    JMenuItem hk = new JMenuItem("Hong Kong Campus");

    JMenu courses = new JMenu("Courses");
    JMenuItem bit = new JMenuItem("Information Technology");
    JMenuItem psy = new JMenuItem("Psychology");
    JMenuItem busi = new JMenuItem("Business");
    JMenu activities = new JMenu("Activities");
    JMenuItem golf = new JMenuItem("Golfing");
    JMenuItem bowling =  new JMenuItem("Bowling");
    JLabel detail = new JLabel();
    public JavaJuniorCollege(){
        setLayout(new BorderLayout());
        setSize(1000, 1000);
        locations.add(sing);
        locations.add(aus);
        locations.add(hk);
        sing.setActionCommand("sing");
        aus.setActionCommand("aus");
        hk.setActionCommand("hk");
        courses.add(bit);
        courses.add(psy);
        courses.add(busi);
        bit.setActionCommand("bit");
        psy.setActionCommand("psy");
        busi.setActionCommand("busi");
        activities.add(golf);
        activities.add(bowling);
        golf.setActionCommand("golf");
        bowling.setActionCommand("bowling");
        menubar.setPreferredSize(new Dimension(1000, 100));
        menubar.add(locations);
        menubar.add(courses);
        menubar.add(activities);

        //menubar.add(locations);
        sing.addActionListener(this);
        aus.addActionListener(this);
        hk.addActionListener(this);
        bit.addActionListener(this);
        psy.addActionListener(this);
        busi.addActionListener(this);
        golf.addActionListener(this);
        bowling.addActionListener(this);
        add(menubar, BorderLayout.NORTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        detail.setHorizontalAlignment(SwingConstants.CENTER);
        add(detail, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            JavaJuniorCollege frame = new JavaJuniorCollege();
            frame.setVisible(true);
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("sing")){
            detail.setText("Information About Our Campus In Singapore");
            repaint();
        }
        else if(e.getActionCommand().equals("aus")){
            detail.setText("Information About Our Campus In Australia");
            repaint();
        }
        else if(e.getActionCommand().equals("hk")){
            detail.setText("Information About Our Campus In HongKong");
            repaint();
        }

        else if(e.getActionCommand().equals("bit")){
            detail.setText("Information About Our Course: Information Technology");
            repaint();
        }
        else if(e.getActionCommand().equals("psy")){
            detail.setText("Information About Our Course: Psychology");
            repaint();
        }
        else if(e.getActionCommand().equals("busi")){
            detail.setText("Information About Our Course: Business");
            repaint();
        }
        else if(e.getActionCommand().equals("golf")){
            detail.setText("Information About Our Golf Activity");
            repaint();
        }
        else if(e.getActionCommand().equals("bowling")){
            detail.setText("Information About Our Bowling Activity");
            repaint();
        }
    }
}
