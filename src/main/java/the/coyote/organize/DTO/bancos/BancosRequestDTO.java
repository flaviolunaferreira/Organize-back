package the.coyote.organize.DTO.bancos;

import lombok.Data;
import lombok.NoArgsConstructor;
import the.coyote.organize.entity.BancoEntity;

@Data
@NoArgsConstructor
public class BancosRequestDTO {

    private Integer numero;
    private String nome;

    public BancoEntity newBanco() {
       return new BancoEntity(numero, nome);
    }
}
