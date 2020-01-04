public class RaceHorse extends Horse{
    int races;
    public RaceHorse(String name, String color, int birthyear, int num_races){
        horse_name = name;
        horse_color = color;
        birth = birthyear;
        races = num_races;
    }

    public int getRaces() {
        return races;
    }

    public void setRaces(int races) {
        this.races = races;
    }
}
