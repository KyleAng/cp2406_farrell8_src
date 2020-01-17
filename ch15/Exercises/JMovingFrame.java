import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class JMovingFrame extends JFrame implements ActionListener {
    protected JPanel north = new JPanel();
    protected JPanel south = new JPanel();
    protected JPanel east = new JPanel();
    protected JPanel west = new JPanel();
    protected JButton move = new JButton("Move");
    protected JLabel moving = new JLabel("I AM HERE!");

    public JMovingFrame(){
        setSize(1000, 1000);
        setLayout(new BorderLayout());
        north.setPreferredSize(new Dimension(1000, 200));
        south.setPreferredSize(new Dimension(1000, 200));
        east.setPreferredSize(new Dimension(200, 1000));
        west.setPreferredSize(new Dimension(200, 1000));
        add(north, BorderLayout.NORTH);
        add(south, BorderLayout.SOUTH);
        add(east, BorderLayout.EAST);
        add(west, BorderLayout.WEST);
        add(move, BorderLayout.CENTER);
        move.setHorizontalAlignment(SwingConstants.CENTER);;
        move.addActionListener(this);
        move.setActionCommand("change");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            JMovingFrame frame = new JMovingFrame();
            frame.setVisible(true);
        });
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("change")){
            //remove(moving);
            int random = get_random(0, 3);
            if(random == 0){
                north.add(moving);
                revalidate();
                repaint();
            }
            else if(random == 1){
                south.add(moving);
                revalidate();
                repaint();
            }
            else if(random == 2){
                east.add(moving);
                revalidate();
                repaint();
            }

            else if(random == 3){
                west.add(moving);
                revalidate();
                repaint();
            }
        }
    }

    private static int get_random(int min, int max){
        Random r = new Random();
        int randomNum = r.nextInt((max - min) + 1) + min;
        return randomNum;
    }
}
