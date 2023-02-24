package app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@NamedQueries(
//        {@NamedQuery(name = "findPersonByName", query = "from Person pers where pers.name = :name"),
//                @NamedQuery(name = "findPersonByNameAndPassword", query = "from Person pers where pers.name = :name and pers.password=:password")
//        }
//)

@Entity
@Table(name="grad_asistent")
public class GradAsistentEntity implements Serializable{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;


    @Column(name = "nume")
    private String nume;
}
