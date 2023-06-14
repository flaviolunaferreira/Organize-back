package the.coyote.organize.DTO.cartoes;

import lombok.Data;
import lombok.NoArgsConstructor;
import the.coyote.organize.entity.CartoesEntity;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
public class CartoesResponseDTO {

    private Long id;
    private String cartaoNumero;
    private String conta;
    private String titular;
    private String tipo;
    private int dataBase;
    private BigDecimal limite;
    private String createdBy;
    private Date createdDate;

    public CartoesResponseDTO(CartoesEntity entity) {
        this.setId(entity.getId());
        this.setCartaoNumero(entity.getCartaoNumero());
        this.setConta(entity.getConta().getContaNumero() + " - " + entity.getConta().getBanco().getNome());
        this.setTitular(entity.getTitular());
        this.setTipo(entity.getTipo());
        this.setDataBase(entity.getDataBase());
        this.setLimite(entity.getLimite());
        this.setCreatedBy(entity.getCreatedBy());
        this.setCreatedDate(entity.getCreatedDate());
    }

}
