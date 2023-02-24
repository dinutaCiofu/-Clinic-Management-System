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
import java.util.Set;

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
@Table(name="programare_unitate_medicala")
public class ProgramUnitateMedicalaEntity implements Serializable{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;


    @Column(name = "ziLucratoare_start")
    private Integer ziLucratoareStart;


    @Column(name = "ziLucratoare_final")
    private Integer ziLucratoareFinal;


    @Column(name = "ziWeekend_start")
    private Integer ziWeekendStart;


    @Column(name = "ziWeekend_final")
    private Integer ziWeekendFinal;

    @OneToMany(fetch = FetchType.LAZY)
    private Set<UnitateMedicalaEntity> unitatiMedicale;
}
