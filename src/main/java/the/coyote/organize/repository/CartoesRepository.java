package the.coyote.organize.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import the.coyote.organize.entity.CartoesEntity;

public interface CartoesRepository extends JpaRepository<CartoesEntity, Long> {
}
