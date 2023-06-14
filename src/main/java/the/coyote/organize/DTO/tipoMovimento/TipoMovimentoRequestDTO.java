package the.coyote.organize.DTO.tipoMovimento;

import lombok.Data;
import lombok.NoArgsConstructor;
import the.coyote.organize.entity.TipoMovimentoEntity;

@Data
@NoArgsConstructor
public class TipoMovimentoRequestDTO {

    private String descricao;
    private String tipo;


    public TipoMovimentoEntity newTipoMovimento() {
        return new TipoMovimentoEntity(descricao, tipo);
    }
}