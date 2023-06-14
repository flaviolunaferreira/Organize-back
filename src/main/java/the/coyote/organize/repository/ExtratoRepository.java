package the.coyote.organize.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import the.coyote.organize.entity.ExtratoEntity;

public interface ExtratoRepository extends JpaRepository<ExtratoEntity, Long> {
}
