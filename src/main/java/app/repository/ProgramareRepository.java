package app.repository;
import app.model.PacientEntity;
import app.model.ProgramareEntity;
import java.util.Date;
public interface ProgramareRepository extends CRUDRepository<ProgramareEntity, Integer>{
    ProgramareEntity findProgramareByDate(Date data);
    ProgramareEntity adaugaProgramare(ProgramareEntity entity);
}
