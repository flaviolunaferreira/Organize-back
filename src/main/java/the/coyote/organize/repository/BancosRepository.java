package the.coyote.organize.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import the.coyote.organize.entity.BancoEntity;

public interface BancosRepository extends JpaRepository<BancoEntity, Long> {
    BancoEntity findByNome(String name);

    BancoEntity findByNumero(Integer numero);
}
