public class SandwichFilling {
    String filling_type;
    int calories_per_serving;

    public SandwichFilling(String fill, int calories){
        filling_type = fill;
        calories_per_serving = calories;

    }

    public String getFilling_type() {
        return filling_type;
    }

    public int getCalories_per_serving() {
        return calories_per_serving;
    }
}
