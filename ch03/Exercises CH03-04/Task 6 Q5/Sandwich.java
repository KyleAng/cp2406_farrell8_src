public class Sandwich {
    Bread slice1;
    Bread slice2;
    SandwichFilling fill;

    public Sandwich(Bread oneslice, Bread twoslice, SandwichFilling thesand){
        slice1 = oneslice;
        slice2 = twoslice;
        fill = thesand;
    }

    public int getSandwichCalories(){
        return slice1.getCalories_per_slice() + slice2.getCalories_per_slice() + fill.getCalories_per_serving();
    }
}
