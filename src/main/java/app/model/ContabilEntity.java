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
@Table(name="contabil")
public class ContabilEntity extends AngajatEntity implements Serializable{

    @Column(name="venituri")
    private Double venituri;


    @Column(name="cheltuieli")
    private Double cheltuieli;
}
