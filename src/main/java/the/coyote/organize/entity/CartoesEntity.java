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
@NoArgsConstructor
@Table(name = "cartoes")
@EqualsAndHashCode(callSuper = true)
public class CartoesEntity extends BaseEntity {

    private String cartaoNumero;

    @OneToOne
    @JoinColumn(name = "id_conta")
    private ContasEntity conta;

    private String titular;
    private String tipo;
    private int dataBase;
    private BigDecimal limite;


    public CartoesEntity(String cartaoNumero, ContasEntity contasEntity, String titular, String tipo, int dataBase, BigDecimal limite) {
        super();
        this.cartaoNumero = cartaoNumero;
        this.conta = contasEntity;
        this.titular = titular;
        this.tipo = tipo;
        this.dataBase = dataBase;
        this.limite = limite;
    }

}
