public class ScentedCandle extends Candle{
    private String candle_scent;
    public ScentedCandle(){}

    public ScentedCandle(String scent){
        candle_scent = scent;
    }

    public String getScent() {
        return candle_scent;
    }

    public void setScent(String scent) {
        this.candle_scent = scent;
    }
    @Override
    public void setCandle_height(Double candle_height) {
        this.candle_height = candle_height;
        this.candle_price = candle_height * 3;
    }
}
