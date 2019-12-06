public class TestSandwichFilling {
    public static void main(String[] args){
        SandwichFilling myfilling = new SandwichFilling("Tuna", 500);
        System.out.println("Filling: " + myfilling.getFilling_type());
        System.out.println("Calories in filling: " + myfilling.getCalories_per_serving());

        SandwichFilling yourfiling = new SandwichFilling("Ham 'n Cheese", 1000);
        System.out.println("Filling: " + yourfiling.getFilling_type());
        System.out.println("Calories in filling: " + yourfiling.getCalories_per_serving());

        SandwichFilling theirfilling = new SandwichFilling("Baked Beans", 5000);
        System.out.println("Filling: " + theirfilling.getFilling_type());
        System.out.println("Calories in filling: " + theirfilling.getCalories_per_serving());
    }
}
