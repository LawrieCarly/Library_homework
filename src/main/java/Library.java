import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;

    private Integer capacity;

    public Library (Integer capacity){
        this.capacity = capacity;
        this.stock = new ArrayList<Book>();

    }

    public void addBook(Book book){
        if (!fullStock()) {
            this.stock.add(book);
        }
        else return;
    }

    public int stockCount(){
        return this.stock.size();
    }

    public boolean fullStock(){
        return stockCount() >= this.capacity;
    }

    public Book removeBook(){
        return this.stock.remove(0);
    }

}
