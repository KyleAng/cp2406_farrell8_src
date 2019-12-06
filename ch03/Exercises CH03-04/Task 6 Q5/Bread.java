public class Bread {
    String bread_type;
    int calories_per_slice;
    public final String MOTTO = "The staff of life ";

    public Bread(String type, int calories){
        bread_type = type;
        calories_per_slice = calories;
    }

    public String getBread_type() {
        return bread_type;
    }

    public int getCalories_per_slice(){
        return calories_per_slice;
    }
}
