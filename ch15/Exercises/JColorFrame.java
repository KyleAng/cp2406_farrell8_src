import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class JColorFrame extends JFrame implements ActionListener {
    protected JButton change = new JButton("Press me to change colour");
    protected JLabel north = new JLabel("North");
    protected JLabel south = new JLabel("South");
    protected JLabel east = new JLabel("East");
    protected JLabel west = new JLabel("West");
    protected Color[] colours = new Color[]{Color.BLUE, Color.BLACK, Color.CYAN, Color.WHITE, Color.YELLOW, Color.RED, Color.PINK};


    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            JColorFrame frame = new JColorFrame();
            frame.setVisible(true);
        });
    }
    public JColorFrame(){
        setSize(500, 500);
        north.setPreferredSize(new Dimension(400, 50));
        south.setPreferredSize(new Dimension(400, 50));
        east.setPreferredSize(new Dimension(50, 400));
        west.setPreferredSize(new Dimension(50, 400));
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(change, BorderLayout.CENTER);
        change.addActionListener(this);
        change.setActionCommand("change");
        north.setHorizontalAlignment(SwingConstants.CENTER);
        south.setHorizontalAlignment(SwingConstants.CENTER);
        east.setHorizontalAlignment(SwingConstants.CENTER);
        west.setHorizontalAlignment(SwingConstants.CENTER);
        north.setOpaque(true); south.setOpaque(true); east.setOpaque(true); west.setOpaque(true);
        //north.setBackground(Color.BLACK);

        add(north, BorderLayout.NORTH);
        add(south, BorderLayout.SOUTH);
        add(east, BorderLayout.EAST);
        add(west, BorderLayout.WEST);

        pack();
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("change")){
            int random = get_random(0, colours.length-1);
            int random2 = get_random(0, 3);
            if(random2 == 0){
                north.setBackground(colours[random]);
            }
            else if(random2 == 1){
                south.setBackground(colours[random]);
            }
            else if(random2 == 2){
                east.setBackground(colours[random]);
            }
            else if(random2 == 3){
                west.setBackground(colours[random]);
            }
        }
    }
    private static int get_random(int min, int max){
        Random r = new Random();
        int randomNum = r.nextInt((max - min) + 1) + min;
        return randomNum;
    }
}
