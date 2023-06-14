package the.coyote.organize.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import the.coyote.organize.entity.MovimentoEntity;

public interface MovimentoRepository extends JpaRepository<MovimentoEntity, Long> {
}
