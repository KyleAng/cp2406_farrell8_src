public abstract class Book {
    String book_title;
    Double price;

    public Book(String title){
        book_title = title;
    }

    public Double getPrice() {
        return price;
    }

    public String getBook_title(){
        return book_title;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
