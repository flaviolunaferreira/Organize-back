package the.coyote.organize.DTO.movimento;

import lombok.Data;
import lombok.NoArgsConstructor;
import the.coyote.organize.entity.CartoesEntity;
import the.coyote.organize.entity.TipoMovimentoEntity;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
public class MovimentoRequestDTO {

    private Date data;
    private TipoMovimentoEntity tdm;
    private String formaPagamento;
    private CartoesEntity cartao;
    private BigDecimal valor;
    private String descricao;
    private Integer parcelas;
    private Integer diaBase;

}
