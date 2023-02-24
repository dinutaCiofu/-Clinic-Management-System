package app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


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
@Table(name="angajat")

public class AngajatEntity extends UtilizatorEntity implements Serializable{

    @Column(name = "salariu_negociat")
    private Integer salariuNegociat;


    @Column(name = "nr_ore_luna")
    private Integer nrOreLuna;


    @Column(name = "IBAN")
    private String iban;


    @Column(name = "nr_contract")
    private String nrContract;


    @Column(name = "data_angajarii")
    private Date dataAngajarii;

}
