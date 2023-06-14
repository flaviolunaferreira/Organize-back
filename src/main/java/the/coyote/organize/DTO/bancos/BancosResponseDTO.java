package the.coyote.organize.DTO.bancos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import the.coyote.organize.entity.BancoEntity;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BancosResponseDTO {

    private Long id;
    private Integer numero;
    private String nome;


    public BancosResponseDTO(BancoEntity save) {
        this.setId(save.getId());
        this.setNumero(save.getNumero());
        this.setNome(save.getNome());
    }
}
