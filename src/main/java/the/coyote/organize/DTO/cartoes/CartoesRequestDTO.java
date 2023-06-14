package the.coyote.organize.DTO.cartoes;

import lombok.Data;
import lombok.NoArgsConstructor;
import the.coyote.organize.entity.CartoesEntity;
import the.coyote.organize.entity.ContasEntity;
import the.coyote.organize.exceptions.NotFound;
import the.coyote.organize.repository.ContasRepository;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class CartoesRequestDTO {

    private String cartaoNumero;
    private Long conta;
    private String titular;
    private String tipo;
    private int dataBase;
    private BigDecimal limite;

    public CartoesEntity newCartao(ContasRepository repository) {
        ContasEntity contasEntity = repository.findById(conta).orElseThrow(() -> new NotFound("Conta não encontrada."));
        return new CartoesEntity(cartaoNumero, contasEntity, titular, tipo, dataBase, limite);
    }
}
