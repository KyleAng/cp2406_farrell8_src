public class Billing {
    private final double percent_tax = 0.08;
    public static void main(String[] args){
        double photobook_price = 500.00;
        int photobook_quantity = 15;
        double coupon_value = 50.00;
        Billing bill = new Billing();
        System.out.println("Price plus tax: " + bill.total(photobook_price));
        System.out.println("Price plus quantity and tax: " + bill.total(photobook_price, photobook_quantity));
        System.out.println("Price plus quantity and tax minus coupon " + bill.total(photobook_price, photobook_quantity, coupon_value));
    }

    public double total(double price){
        return price + (price * percent_tax);
    }


    public double total(double price, int quantity){
        double total_price = (double) price * quantity;
        return total_price + (total_price * percent_tax);
    }

    public double total(double price, int quantity, double coupon){
        double total_price = (double) (price * quantity) - coupon;
        return total_price + (total_price * percent_tax);
    }
}
