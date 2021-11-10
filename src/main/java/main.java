import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        LocalDate fin = LocalDate.of(2021, 11, 29);
        Employee e = new Employee("pablo", "rodriguez", "123456789");
        Task t = new Task("nueva tarea", fin);
        Card c = new Card(24, TypeCard.black);
        e.setCard(c);
        c.setEmployee(e);
        e.addTask(t);
        try {
            String des = "nueva tarea";
            t.setDescription(des);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();
        //se crea transaccion y se abre
        em.getTransaction().begin();

        em.persist(e);
        em.persist(c);
        em.persist(t);
        //Employee e = em.find(Employee.class,1);
        System.out.println(e.toString());
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
