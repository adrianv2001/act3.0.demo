import javax.persistence.*;
enum TypeCard {black, gold , silver};
@Entity
@Table(name = "cards")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(nullable = false)
    private int code;
    @Transient
    private TypeCard type;
    @OneToOne
    @JoinColumn(name="idEmployee")
    private Employee e;

    public Card() {
    }

    public Card(int code, TypeCard type) {
        this.code = code;
        this.type = type;
    }

    public int getId() {
        return id;
    }
    public int getCode() {
        return code;
    }
    public void setEmployee(Employee e) {
        this.e=e;
    }
    public void setCode(int code) {
        this.code = code;
    }

    public TypeCard getType() {
        return type;
    }

    public void setType(TypeCard type) {
        this.type = type;
    }
}
