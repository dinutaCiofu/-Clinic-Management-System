package app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@NamedQueries(
        {@NamedQuery(name = "findFunctieByName", query = "from FunctieEntity functie where functie.numeFunctie = :numeFunctie"),
        @NamedQuery(name = "findAllFunctions", query = "from FunctieEntity"),
        @NamedQuery(name = "findFunctieById", query = "from FunctieEntity functie where functie.id=:id ")
        }
)

@Entity
@Table(name="functie")
public class FunctieEntity implements Serializable{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "nume_functie")
    private String numeFunctie;

}
