public class TestSandwich {
    public static void main(String[] args){

        System.out.println("My Sandwich: ");
        Bread myslice1 = new Bread("wholemeal", 100);
        Bread myslice2 = new Bread("rye", 250);
        SandwichFilling myfilling = new SandwichFilling("Tuna", 250);
        Sandwich mysandwich = new Sandwich(myslice1, myslice2, myfilling);
        System.out.println("Bread type of slice 1: " + mysandwich.slice1.getBread_type());
        System.out.println("Bread type of slice 2: " + mysandwich.slice2.getBread_type());
        System.out.println("Calories for slice 1: " + mysandwich.slice1.getCalories_per_slice());
        System.out.println("Calories for slice 2: " + mysandwich.slice2.getCalories_per_slice());
        System.out.println("Filling type: " + mysandwich.fill.getFilling_type());
        System.out.println("Filling calories: " + mysandwich.fill.getCalories_per_serving());
        System.out.println("Total calories: " + mysandwich.getSandwichCalories() + "\n");
        System.out.println("Your Sandwich: ");

        Bread yourslices = new Bread("White", 1000);
        SandwichFilling yourfilling = new SandwichFilling("Ham 'n Cheese", 500);
        Sandwich yoursandwich = new Sandwich(yourslices, yourslices, yourfilling);
        System.out.println("Bread type of slice 1: " + yoursandwich.slice1.getBread_type());
        System.out.println("Bread type of slice 2: " + yoursandwich.slice2.getBread_type());
        System.out.println("Calories for slice 1: " + yoursandwich.slice1.getCalories_per_slice());
        System.out.println("Calories for slice 2: " + yoursandwich.slice2.getCalories_per_slice());
        System.out.println("Filling type: " + yoursandwich.fill.getFilling_type());
        System.out.println("Filling calories: " + yoursandwich.fill.getCalories_per_serving());
        System.out.println("Total calories " + yoursandwich.getSandwichCalories() + "\n");
        System.out.println("Their Sandwich: ");
        
        Sandwich theirsandwich = new Sandwich(new Bread("Black", 2500), new Bread("SourRed", 350), new SandwichFilling("Bacon", 500));
        System.out.println("Bread type of slice 1: " + theirsandwich.slice1.getBread_type());
        System.out.println("Bread type of slice 2: " + theirsandwich.slice2.getBread_type());
        System.out.println("Calories for slice 1: " + theirsandwich.slice1.getCalories_per_slice());
        System.out.println("Calories for slice 2: " + theirsandwich.slice2.getCalories_per_slice());
        System.out.println("Filling type: " + theirsandwich.fill.getFilling_type());
        System.out.println("Filling calories: " + theirsandwich.fill.getCalories_per_serving());
        System.out.println("Total calories " + theirsandwich.getSandwichCalories());
    }

}
