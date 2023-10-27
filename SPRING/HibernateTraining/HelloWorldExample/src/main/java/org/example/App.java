package org.example;

import org.example.entity.Categories;
import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();

        Categories category = new Categories();
        category.setDescription("It's my personal category :|");
        category.setName("NEW CATEGORY");
        session.persist(category);
        session.getTransaction().commit();

        session.close();

        System.out.println( "Hello World!" );
    }
}
