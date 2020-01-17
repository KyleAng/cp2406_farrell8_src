import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPizza extends JFrame implements ActionListener {
    protected int price = 0;
    protected int toppings = 0;
    protected int topping_price = 0;
    protected JLabel dis_price = new JLabel(("Price: $" + price));
    protected JLabel pizza = new JLabel("Pizza!");
    protected ButtonGroup choices = new ButtonGroup();
    protected JRadioButton smol = new JRadioButton("Small");
    protected JRadioButton medium = new JRadioButton("Medium");
    protected JRadioButton large = new JRadioButton("Large");
    protected JToggleButton topping1 = new JToggleButton("Cat");
    protected JToggleButton topping2 = new JToggleButton("Dog");
    protected JToggleButton topping3 = new JToggleButton("Frog");
    protected JToggleButton topping4 = new JToggleButton("Mouse");
    protected JToggleButton topping5 = new JToggleButton("Rat");
    protected JToggleButton[] buttons = new JToggleButton[]{topping1, topping2, topping3, topping4, topping5};
    protected JButton the_price = new JButton("Get Price");
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JPizza frame = new JPizza();
                frame.setVisible(true);
            }
        });
    }

    public JPizza(){
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        setSize(100, 100);
        smol.setActionCommand("small");
        medium.setActionCommand("medium");
        large.setActionCommand("large");
        choices.add(smol);
        choices.add(medium);
        choices.add(large);
        panel.add(smol);
        panel.add(medium);
        panel.add(large);
        for(int i = 0; i<buttons.length; i++){
            buttons[i].setSize(40, 40);
            buttons[i].addActionListener(this);
            buttons[i].setActionCommand("update");
            panel2.add(buttons[i]);
        }

        smol.addActionListener(this);
        medium.addActionListener(this);
        large.addActionListener(this);
        panel.setLayout(new FlowLayout());
        panel2.setLayout(new FlowLayout());
        add(panel, BorderLayout.NORTH);
        add(panel2, BorderLayout.CENTER);
        add(dis_price, BorderLayout.SOUTH);
        the_price.setHorizontalAlignment(SwingConstants.CENTER);
        dis_price.setHorizontalAlignment(SwingConstants.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public void actionPerformed(ActionEvent e){
        String ae = e.getActionCommand();
        for(int i=0; i < buttons.length; i++){
            if(buttons[i].isSelected()){
                toppings += 1;
            }
        }
        topping_price = toppings;
        toppings = 0;
        System.out.println(toppings);
        if(ae.equals("small")){
            price = 7;
            dis_price.setText("Price: $" + (price + topping_price));
        }

        else if(ae.equals("medium")){
            price = 9;
            dis_price.setText("Price: $" + (price + topping_price));
        }

        else if(ae.equals("large")){
            price = 11;
            dis_price.setText("Price: $" + (price + topping_price));
        }

        else if(ae.equals("update")){
            dis_price.setText("Price: $" + ((price + topping_price)));
        }



    }
}
