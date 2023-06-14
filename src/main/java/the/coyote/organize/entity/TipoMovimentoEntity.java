package the.coyote.organize.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "tipomovimento")
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class TipoMovimentoEntity extends BaseEntity {

    private String descricao;
    private String tipo;

    public TipoMovimentoEntity(String descricao, String tipo) {
        super();
        this.descricao = descricao;
        this.tipo = tipo;
    }
}
