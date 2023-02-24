package app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


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
@Table(name="asistent")
public class AsistentEntity extends AngajatEntity implements Serializable{


    @OneToOne(cascade = CascadeType.ALL)
    private TipAsistentEntity tipAsistent;

    @OneToOne(cascade = CascadeType.ALL)
    private GradAsistentEntity gradAsistent;
}
