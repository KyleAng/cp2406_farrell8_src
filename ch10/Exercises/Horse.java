public class Horse {
    String horse_name;
    String horse_color;
    int birth;

    public Horse(){
        horse_name = "name";
        horse_color = "brown";
        birth = 2000;
    }

    public Horse(String name){
        horse_name = name;
        horse_color = "brown";
        birth = 2000;
    }

    public Horse(String name, String color, int birthyear){
        horse_name = name;
        horse_color = color;
        birth = birthyear;
    }

    public String getHorse_name(){
        return horse_name;
    }

    public String getHorse_color() {
        return horse_color;
    }

    public int getBirth_year() {
        return birth;
    }

    public void setHorse_name(String horse_name) {
        this.horse_name = horse_name;
    }

    public void setHorse_color(String horse_color) {
        this.horse_color = horse_color;
    }

    public void setBirth_year(int birth) {
        this.birth = birth;
    }
}
