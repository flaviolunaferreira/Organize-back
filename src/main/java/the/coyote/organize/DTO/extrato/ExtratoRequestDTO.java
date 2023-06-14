package the.coyote.organize.DTO.extrato;

import lombok.Data;
import lombok.NoArgsConstructor;
import the.coyote.organize.entity.TipoMovimentoEntity;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
public class ExtratoRequestDTO {

    private Date data;
    private String descricao;
    private TipoMovimentoEntity tdm;
    private BigDecimal valor;
    private BigDecimal saldo;

}
