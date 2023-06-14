package the.coyote.organize.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "bancos")
@NoArgsConstructor
public class BancoEntity extends BaseEntity{

    private Integer numero;
    private String nome;

    public BancoEntity(Integer numero, String nome) {
        super();
        this.numero = numero;
        this.nome = nome;
    }
}
