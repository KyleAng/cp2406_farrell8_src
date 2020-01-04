

public class BookArray {
    public static void main(String[] args){
        Book[] books = new Book[10];
        double r;
        for(int i = 0; i < books.length; i++){
            r = getRandom();
            if(r > 0.5) {
                books[i] = new Fiction("Fiction Book Number " + (i + 1));
            }
            else{
                books[i] = new NonFiction("Non-Fiction Book Number " + (i+1));
            }
        }

        for(Book i: books){
            System.out.println(i.getBook_title() + " Costs $" + i.getPrice());
        }
    }

    public static double getRandom(){
        double x = Math.random();
        return x;

    }

}
