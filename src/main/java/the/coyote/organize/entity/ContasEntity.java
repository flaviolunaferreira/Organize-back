package the.coyote.organize.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "contas")
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ContasEntity extends BaseEntity {

    private String contaNumero;

    @OneToOne
    @JoinColumn(name = "id_banco")
    private BancoEntity Banco;

    private String chavePix;
    private BigDecimal saldo;

    public ContasEntity(String contaNumero, BancoEntity banco, String chavePix, BigDecimal saldo) {
        super();
        this.contaNumero = contaNumero;
        this.Banco = banco;
        this.chavePix = chavePix;
        this.saldo = saldo;
    }
}
