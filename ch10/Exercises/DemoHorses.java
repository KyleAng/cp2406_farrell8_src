public class DemoHorses {

    public static void main(String[] args){
        RaceHorse your_horse = new RaceHorse("Cat", "orange", 2010, 29);
        System.out.println(your_horse.getHorse_name() + " Has raced: " + your_horse.getRaces() + " races");
        System.out.println(your_horse.getHorse_name() + " is " + your_horse.getHorse_color() + " in color ");
        System.out.println(your_horse.getHorse_name() + "'s birth year is " + your_horse.getBirth_year());
        System.out.println(your_horse.getHorse_name() + " is a " + your_horse.getClass());

        Horse their_horse = new Horse("Catto", "grey", 2005);
        System.out.println(their_horse.getHorse_name() + " is " + their_horse.getHorse_color() + " in color");
        System.out.println(their_horse.getHorse_name() + "'s birth year is " + their_horse.getBirth_year());
        System.out.println(their_horse.getHorse_name() + " is a " + their_horse.getClass());

    }
}
