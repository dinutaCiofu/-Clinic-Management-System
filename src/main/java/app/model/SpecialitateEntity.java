package app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Objects;
import app.model.ServiciuMedicalEntity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="specialitate")
public class SpecialitateEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "nume")
    private String nume;

    @OneToMany(fetch = FetchType.LAZY)
    private List<ServiciuMedicalEntity> serviciiMedicale;

}
