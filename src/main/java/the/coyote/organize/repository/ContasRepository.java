package the.coyote.organize.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import the.coyote.organize.entity.ContasEntity;

public interface ContasRepository extends JpaRepository<ContasEntity, Long> {
}
