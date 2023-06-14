package the.coyote.organize.DTO.contas;

import lombok.Data;
import lombok.NoArgsConstructor;
import the.coyote.organize.entity.ContasEntity;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class ContasResponseDTO {

    private Long id;
    private String contaNumero;
    private String nomeBanco;
    private String chavePix;
    private BigDecimal Saldo;

    public ContasResponseDTO(ContasEntity save) {
        this.setId(save.getId());
        this.setContaNumero(save.getContaNumero());
        this.setNomeBanco(save.getBanco().getNome().toString());
        this.setChavePix(save.getChavePix());
        this.setSaldo(save.getSaldo());
    }

}
