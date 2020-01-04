import javax.swing.JOptionPane;
public class TwoEventParticipants {

    public static void main(String[] args){
        Participant[] minimarathon = new Participant[2];
        Participant[] diving = new Participant[2];
        String name;
        int age;
        String address;
        JOptionPane.showMessageDialog(null, "ENTERING PARTICIPANTS FOR DIVING COMPETITION ");
        for(int i = 0; i < diving.length; i++){
            name = JOptionPane.showInputDialog("Enter name of Participant ");
            age = Integer.parseInt(JOptionPane.showInputDialog("Enter age of participant"));
            address = JOptionPane.showInputDialog("Enter address ");
            diving[i] = new Participant(name, age, address);
        }

        JOptionPane.showMessageDialog(null, "ENTERING PARTICIPANTS FOR MINI MARATHON ");
        for(int i = 0; i < minimarathon.length; i++){
            name = JOptionPane.showInputDialog("Enter name of Participant ");
            age = Integer.parseInt(JOptionPane.showInputDialog("Enter age of participant"));
            address = JOptionPane.showInputDialog("Enter address ");
            minimarathon[i] = new Participant(name, age, address);
        }

        System.out.println("Participants for diving competition");
        for(int i = 0; i < diving.length; i++){
            System.out.println(diving[i]);
        }
        System.out.println("Participants for mini marathon");
        for(int i = 0; i < minimarathon.length; i++){
            System.out.println(minimarathon[i]);
        }
    }
}
