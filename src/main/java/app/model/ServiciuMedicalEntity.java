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
        {@NamedQuery(name = "findServiciuMedicalByName", query = "from ServiciuMedicalEntity serviciuMedical where serviciuMedical.numeServiciu = :numeServiciu"),
        @NamedQuery(name = "findServiciuMedicalById", query = "from ServiciuMedicalEntity serviciuMedical where serviciuMedical.id = :id"),
                @NamedQuery(name = "findAllServiciiMedicale", query = "from ServiciuMedicalEntity")
        }
)

@Entity
@Table(name="serviciu_medical")
public class ServiciuMedicalEntity implements Serializable{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;


    @Column(name = "nume_serviciu")
    private String numeServiciu;


    @Column(name = "pret")
    private Integer pret;


    @Column(name = "durata")
    private Integer durata;

    @OneToMany( fetch = FetchType.LAZY)
    private List<PacientEntity> pacienti;

}
