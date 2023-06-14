package the.coyote.organize.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "Extrato")
@EqualsAndHashCode(callSuper = true)
public class ExtratoEntity extends BaseEntity {

    private Date data;
    private String descricao;
    private Long tipomovimento;
    private BigDecimal valor;
    private BigDecimal saldo;
}
