package app.single_point_access;

import app.repository.PacientRepository;
import app.repository.ProgramareRepository;
import app.repository.ServiciuMedicalRepository;
import app.repository.UtilizatorRepository;
import app.repository.implemetation.PacientRepositoryImpl;
import app.repository.implemetation.ProgramareRepositoryImpl;
import app.repository.implemetation.ServiciuMedicalRepositoryImpl;
import app.repository.implemetation.UtilizatorRepositoryImpl;
import org.springframework.web.servlet.tags.EscapeBodyTag;

public class RepositorySinglePointAccess {

    private static UtilizatorRepository utilizatorRepository;
    private static PacientRepository pacientRepository;
    private static ProgramareRepository programareRepository;
    private static ServiciuMedicalRepository serviciuMedicalRepository;

    static {
        programareRepository=new ProgramareRepositoryImpl();
    }

    static {
        utilizatorRepository = new UtilizatorRepositoryImpl();
    }

    static {
        pacientRepository = new PacientRepositoryImpl();
    }
    static {
        serviciuMedicalRepository=new ServiciuMedicalRepositoryImpl();
    }
    public static PacientRepository getPacientRepository(){return pacientRepository;}
    public static  UtilizatorRepository getUtilizatorRepository(){
        return utilizatorRepository;
    }
    public static ProgramareRepository getProgramareRepository(){
        return programareRepository;
    }
    public static ServiciuMedicalRepository getServiciuMedicalRepository(){ return  serviciuMedicalRepository;}
}
