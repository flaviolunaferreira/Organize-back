package the.coyote.organize.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "movimento")
@EqualsAndHashCode(callSuper = true)
public class MovimentoEntity extends BaseEntity {

    private Date data;
    private Long tipomovimento;
    private String formaPagamento;
    private Long cartao;
    private BigDecimal valor;
    private String descricao;
    private Integer parcelas;
    private Integer diaBase;

}
