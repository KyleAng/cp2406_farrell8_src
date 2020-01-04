public class UseBook {

    public static void main(String[] args){
        NonFiction my_book = new NonFiction("Into Thin Air");
        System.out.println("My book is " + my_book.getBook_title());
        System.out.println("It costs " + "$" +  my_book.getPrice());

        Fiction your_book = new Fiction("Doctor Zhivago");
        System.out.println("Your book is " + your_book.getBook_title());
        System.out.println("It costs " + "$" + your_book.getPrice());
    }
}
