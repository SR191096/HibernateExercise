import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yashi on 05-07-2017.
 */

@Entity
public class Book {
    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
            Integer book_id;
    String bookName;
    @ManyToMany
    List<Author> author = new ArrayList<>();

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }
}
