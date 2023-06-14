package the.coyote.organize.DTO.tipoMovimento;

import lombok.Data;
import lombok.NoArgsConstructor;
import the.coyote.organize.entity.TipoMovimentoEntity;

@Data
@NoArgsConstructor
public class TipoMovimentoResponseDTO {

    private Long id;
    private String descricao;
    private String tipo;

    public TipoMovimentoResponseDTO(TipoMovimentoEntity tdm) {
        this.setId(tdm.getId());
        this.setDescricao(tdm.getDescricao());
        this.setTipo(tdm.getTipo());
    }
}
