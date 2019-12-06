public class TestBread {
    public static void main(String[] args){
        Bread mybread = new Bread("Rye", 5000);
        System.out.println("Bread type: " + mybread.getBread_type());
        System.out.println("Calories: " + mybread.getCalories_per_slice());

        Bread yourbread = new Bread("White", 19000);
        System.out.println("Bread type: " + yourbread.getBread_type());
        System.out.println("Calories: " + yourbread.getCalories_per_slice());

        Bread theirbread = new Bread("Black", 25000);
        System.out.println("Bread type: " + theirbread.getBread_type());
        System.out.println("Calories: " + theirbread.getCalories_per_slice());
    }
}
