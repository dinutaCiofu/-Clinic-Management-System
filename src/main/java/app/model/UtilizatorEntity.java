package app.model;

import lombok.*;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="utilizator")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@NamedQueries(
        {@NamedQuery(name = "findUserById", query = "from UtilizatorEntity user where user.id = :id"),
                @NamedQuery(name = "findUserByUsernameAndPassword", query = "from UtilizatorEntity user where user.username = :username and user.parola=:parola"),
                @NamedQuery(name = "findAllUsers", query = "from UtilizatorEntity "),
                @NamedQuery(name = "findUserByName", query = "from UtilizatorEntity user where user.nume = :nume"),
        }
)

public class UtilizatorEntity implements Serializable{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;


    @Column(name = "CNP")
    private String cnp;


    @Column(name = "nume")
    private String nume;


    @Column(name = "prenume")
    private String prenume;


    @Column(name = "adresa")
    private String adresa;


    @Column(name = "telefon")
    private String telefon;


    @Column(name = "email")
    private String email;
    @Column(name = "username")
    private String username;


    @Column(name = "parola")
    private String parola;


    @ManyToOne()
    @JoinColumn(name = "functie_id")
    private FunctieEntity functie;

}
