import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
/*

        List<Author> author = new ArrayList<>();

        author.add(new Author("Nikhil","Sharma",28,"12-07-1988"));
        author.add(new Author("Nayana","Goel",26,"10-03-1990"));
        author.add(new Author("Shivangi","Gupta",24,"15-10-1992"));
        author.add(new Author("Shyam","Agarwal",19,"18-11-1997"));
*/

Author author = new Author();
Book book = new Book();


Address address = new Address();
address.setStreetNo(123);
address.setLocation("Rajiv Chowk");
address.setState("Delhi");

author.setFirstName("Ram");
author.setAge(22);
author.setDob(new Date());
author.setAddress(address);
book.setBookName("Discovery Of India");

List<String> subject = new ArrayList<>();
        subject.add("English");
        subject.add("Maths");
        subject.add("Sociology");

        author.getBook().add(book);
        author.getSubjects().addAll(subject);
        book.getAuthor().add(author);

        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();

        session.save(author);
        session.save(book);
        session.getTransaction().commit();
        session.close();

    }

}

