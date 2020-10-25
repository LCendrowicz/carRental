package pl.sda.dao;


import org.hibernate.Session;
import org.hibernate.Transaction;
import pl.sda.database.SessionProvider;
import java.util.List;

public class AbstractDao<T> {
    private final Class<T> tClass;

    protected AbstractDao(Class<T> tClass) {
        this.tClass = tClass;
    }

    public void add(T record) {
        Session session = SessionProvider.getSession();
        Transaction transaction = session.beginTransaction();
        session.save(record);
        transaction.commit();
        session.close();
    }

    public void update(T record) {
        Session session = SessionProvider.getSession();
        Transaction transaction = session.beginTransaction();
        session.update(record);
        transaction.commit();
        session.close();
    }

    public void drop(T record) {
        Session session = SessionProvider.getSession();
        Transaction transaction = session.beginTransaction();
        session.delete(record);
        transaction.commit();
        session.close();
    }

    public T findById(int id) {
        Session session = SessionProvider.getSession();
        T record = session.find(tClass, id);
        session.close();
        return record;
    }

    public List<T> findAll() {
        Session session = SessionProvider.getSession();
        List<T> records = session.createQuery("from " + tClass.getCanonicalName(), tClass).list();
        session.close();
        return records;
    }
}
