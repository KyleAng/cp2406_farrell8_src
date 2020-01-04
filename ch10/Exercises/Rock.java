public class Rock {
    int sample;
    String desc;
    double weight;
    public Rock(int num_sample, double r_weight){
        sample = num_sample;
        desc = "Unclassified";
        weight = r_weight;
    }

    public int getSample() {
        return sample;
    }

    public String getDesc() {
        return desc;
    }

    public double getWeight() {
        return weight;
    }
}
