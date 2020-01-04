public class ItemSold {
    int item_invoice_num;
    String item_description;
    Double item_price;
    public ItemSold(){}

    public int getItem_invoice_num() {
        return item_invoice_num;
    }

    public String getItem_description() {
        return item_description;
    }

    public Double getPrice() {
        return item_price;
    }

    public void setItem_invoice_num(int item_invoice_num) {
        this.item_invoice_num = item_invoice_num;
    }

    public void setItem_description(String item_description) {
        this.item_description = item_description;
    }

    public void setPrice(Double price) {
        this.item_price = price;
    }
}
