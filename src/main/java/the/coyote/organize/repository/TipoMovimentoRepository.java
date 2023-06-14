package the.coyote.organize.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import the.coyote.organize.entity.TipoMovimentoEntity;

public interface TipoMovimentoRepository extends JpaRepository<TipoMovimentoEntity, Long> {
}
