import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {
    public static void main(String[] args) {
        //Employee e = new Employee("pablo","rodriguez","123456789");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();
        //se crea transaccion y se abre
        em.getTransaction().begin();
        //em.persist(e);
        Employee e = em.find(Employee.class,1);
        System.out.println(e.toString());
        em.getTransaction().commit();
        em.close();
        emf.close();

    }
}
