import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPhotoFrame extends JFrame implements ActionListener {
    protected int final_price = 0;
    protected int location_price = 0;
    protected int base_price = 40;
    protected int multiple_price = 75;
    protected int pet_price = 95;
    protected int add_location = 90;
    protected ButtonGroup subject_choices = new ButtonGroup();
    protected ButtonGroup location_choices = new ButtonGroup();
    JRadioButton one_person = new JRadioButton("One person");
    JRadioButton two_person = new JRadioButton("Two people");
    JRadioButton pet = new JRadioButton("Pet");
    JRadioButton studio = new JRadioButton("In Studio");
    JRadioButton other = new JRadioButton("Other");
    JLabel the_price = new JLabel("Final Price: $" + final_price);
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JPhotoFrame frame = new JPhotoFrame();
                frame.setVisible(true);
            }
        });
    }
    public JPhotoFrame(){
        setSize(400, 400);
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        subject_choices.add(one_person);
        one_person.addActionListener(this);
        one_person.setActionCommand("one");
        subject_choices.add(two_person);
        two_person.addActionListener(this);
        two_person.setActionCommand("two");
        subject_choices.add(pet);
        pet.addActionListener(this);
        pet.setActionCommand("pet");
        location_choices.add(studio);
        studio.addActionListener(this);
        studio.setActionCommand("studio");
        location_choices.add(other);
        other.addActionListener(this);
        other.setActionCommand("other");

        setLayout(new GridLayout(5, 1));
        panel.setLayout(new FlowLayout());
        panel.add(one_person);
        panel.add(two_person);
        panel.add(pet);
        add(panel);
        panel2.setLayout(new FlowLayout());
        panel2.add(studio);
        panel2.add(other);
        add(panel2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        the_price.setHorizontalAlignment(SwingConstants.CENTER);
        add(the_price);

    }

    public void actionPerformed(ActionEvent e){
        String command = e.getActionCommand();

        if(command.equals("one")){
            final_price = base_price;
            the_price.setText("Final Price: $" + (final_price + location_price));
        }

        else if(command.equals("two")){
            final_price = multiple_price;
            the_price.setText("Final Price: $" + (final_price + location_price));
        }

        else if(command.equals("pet")){
            final_price = pet_price;
            the_price.setText("Final Price: $" + (final_price + location_price));
        }

        if(command.equals("studio")){
            location_price = 0;
            the_price.setText("Final Price: $" + (final_price + location_price));
        }

        else if (command.equals("other")){
            location_price = add_location;
            the_price.setText("Final Price: $" + (final_price + location_price));
        }
    }
}
