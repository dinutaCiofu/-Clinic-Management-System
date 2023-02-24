package app.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;

import java.util.Date;
import java.util.List;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@NamedQueries(
        {@NamedQuery(name = "findProgramareByDate", query = "from ProgramareEntity programare where programare.data = :data"),
                @NamedQuery(name = "findProgramareById", query = "from ProgramareEntity programare where programare.id = :id"),
                @NamedQuery(name = "findAllProgramari", query = "from ProgramareEntity")
        }
)

@Entity
@Table(name="programare")
public class ProgramareEntity implements Serializable{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;


    @Column(name = "ziua_saptamana")
    private String ziuaSaptamana;


    @Column(name = "data")
    private Date data;


    @Column(name = "ora")
    private Time ora;


    @Column(name = "durata")
    private Integer durata;


    @OneToMany(fetch = FetchType.EAGER)
    private List<ServiciuMedicalEntity> serviciiMedicale;
}
