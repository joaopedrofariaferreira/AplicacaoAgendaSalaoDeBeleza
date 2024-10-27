package crud.trabalhoprofessorandreendtoend.usuarios.TipoDeAcesso;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Tabela tiposDeAcesso")
@Entity(name = "TiposDeAcesso")
public class TipoDeAcesso {
    @Id
    private int idTipoDeAcesso;
    private String descricaoDoAcesso;




}
