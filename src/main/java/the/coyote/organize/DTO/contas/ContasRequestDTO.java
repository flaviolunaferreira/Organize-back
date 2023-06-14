package the.coyote.organize.DTO.contas;

import lombok.Data;
import lombok.NoArgsConstructor;
import the.coyote.organize.entity.BancoEntity;
import the.coyote.organize.entity.ContasEntity;
import the.coyote.organize.repository.BancosRepository;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class ContasRequestDTO {

    private String contaNumero;
    private Long bancoId;
    private String chavePix;
    private BigDecimal saldo;

    public ContasEntity newContaRequestDTO(BancosRepository bancosRepository) {
        BancoEntity banco = bancosRepository.findById(bancoId).get();
        return new ContasEntity(contaNumero, banco, chavePix, saldo);
    }
}
