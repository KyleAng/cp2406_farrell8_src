public class Candle {
    private String candle_color;
    Double candle_height;
    Double candle_price;
    public Candle(){}
    public Candle(String color, Double height){
        candle_color = color;
        candle_height = height;
        candle_price = height * 2;

    }

    public String getCandle_color() {
        return candle_color;
    }

    public void setCandle_color(String candle_color) {
        this.candle_color = candle_color;
    }

    public Double getCandle_height() {
        return candle_height;
    }

    public void setCandle_height(Double candle_height) {
        this.candle_height = candle_height;
        this.candle_price = candle_height * 2;
    }

    public Double getCandle_price() {
        return candle_price;
    }

}
