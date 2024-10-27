package crud.trabalhoprofessorandreendtoend.Servico;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Tabela de Servicos")
@Entity(name = "Servicos")
public class Servico {
    private int idServico;
    private String nomeServico;
    private Double valorServico;
}
