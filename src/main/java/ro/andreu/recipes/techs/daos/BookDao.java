package ro.andreu.recipes.techs.daos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ro.andreu.recipes.techs.models.Book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class BookDao {

    @PersistenceContext
    private EntityManager entityManager;

    public Book getByName(String name) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();

        CriteriaQuery<Book> criteria = builder.createQuery( Book.class );
        Root<Book> root = criteria.from( Book.class );
        criteria.select( root );
        criteria.where( builder.equal(root.get("title"), name ) );

        return entityManager.createQuery( criteria ).getSingleResult();
    }
}
