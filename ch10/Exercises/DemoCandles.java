public class DemoCandles {

    public static void main(String[] args){
        Candle my_candle = new Candle();
        my_candle.setCandle_color("white");
        my_candle.setCandle_height(4.5);
        System.out.println("My candle is " + my_candle.getClass());
        System.out.println("My candle's color is " + my_candle.getCandle_color() + ", Height is " + my_candle.getCandle_height() + " Inches");
        System.out.println("And costs $" + my_candle.getCandle_price());

        ScentedCandle your_candle = new ScentedCandle();
        your_candle.setCandle_color("black");
        your_candle.setCandle_height(100.0);
        your_candle.setScent("burnt electronics");
        System.out.println("Your candle is " + your_candle.getClass());
        System.out.println("Your candle's color is " + your_candle.getCandle_color() + ", Height is " + your_candle.getCandle_height() + " Inches");
        System.out.println("Your candle's scent is " + your_candle.getScent() + " and costs $" + your_candle.getCandle_price());
    }
}
