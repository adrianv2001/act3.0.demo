import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;
@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtask", nullable=false)
    private int id;
    @Column(name = "description", length=100)
    private String description;
    @Column(name = "begindate", nullable=false)
    private LocalDate beginDate;
    @Column(name = "enddate", nullable=true)
    private LocalDate endDate;


    public Task() {
    }

    public Task(String description, LocalDate endDate) {
        this.description = description;
        this.endDate = endDate;
    }

    public Task(String description, LocalDate beginDate, LocalDate endDate) {
        this.description = description;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public Task(int id, String description, LocalDate beginDate, LocalDate endDate) {
        this.id = id;
        this.description = description;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id && description.equals(task.description) && beginDate.equals(task.beginDate) && Objects.equals(endDate, task.endDate);
    }
}
