import javax.persistence.*;
enum TypeCard {black, gold , silver};
@Entity
@Table(name = "cards")
public class card {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idcard", nullable=false)
    private int id;
    @Column(name = "code", nullable=true)
    private int code;
    @Transient
    private TypeCard type;
}
