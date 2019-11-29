public class FormLetterWriter {
    public static void main(String[] args){
        String cust_fname = "Lincoln";
        String cust_lname = "Kapoor";
        FormLetterWriter writeletter = new FormLetterWriter();
        writeletter.displaySalutation(cust_lname);
        System.out.println(letter());
        writeletter.displaySalutation(cust_lname, cust_fname);
        System.out.println(letter());

    }

    public void displaySalutation(String lname){
        System.out.println("Dear Mr. or Ms. " + lname);
    }

    public void displaySalutation(String lname, String fname){
        System.out.println("Dear " + fname + " " + lname);
    }

    public static String letter(){
        return "Thank you for your recent order.";
    }
}
