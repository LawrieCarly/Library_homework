import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower (){
        this.collection = new ArrayList<Book>();
    }

    public void addBook(Book book){
        this.collection.add(book);
    }

    public int collectionSize(){
        return this.collection.size();
    }

    public void takeBookOut(Library library){
        this.collection.add(library.removeBook());
    }


}
