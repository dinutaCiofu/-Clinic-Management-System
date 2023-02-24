package app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@NamedQueries(
        {@NamedQuery(name = "findPacientByNumeAndPrenume", query = "from PacientEntity pacient where pacient.nume = :nume and pacient.prenume = :prenume"),
                @NamedQuery(name = "findPacientById", query = "from PacientEntity pacient where pacient.id = :id "),
                @NamedQuery(name = "findAllPacients", query = "from PacientEntity")
        }
)

@Entity
@Table(name="pacient")
public class PacientEntity implements Serializable{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;


    @Column(name = "nume")
    private String nume;


    @Column(name = "prenume")
    private String prenume;


    @Column(name = "CNP")
    private String cnp;


    @OneToMany(fetch = FetchType.EAGER)
    private List<ProgramareEntity> programari;

    @OneToMany(fetch = FetchType.LAZY)
    private List<RaportMedicalEntity> istoricMedical;

}
