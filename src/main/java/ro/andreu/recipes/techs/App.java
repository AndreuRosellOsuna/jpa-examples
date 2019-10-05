package ro.andreu.recipes.techs;

import ro.andreu.recipes.techs.models.Book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Init..." );

        EntityManagerFactory sessionFactory = Persistence.createEntityManagerFactory( "jpa-examples" );

        EntityManager entityManager = sessionFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Book book = new Book();
        book.setTitle("Hibernate rules!");
        entityManager.persist(book);

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
