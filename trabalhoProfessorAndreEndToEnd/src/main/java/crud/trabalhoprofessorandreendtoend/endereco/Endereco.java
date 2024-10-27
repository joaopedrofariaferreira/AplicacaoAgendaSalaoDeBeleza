package crud.trabalhoprofessorandreendtoend.endereco;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "Tabela de Endereco")
@Entity(name = "Endereco")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idEndereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEndereco;

    private String logradouro;
    private String uf;
    private String estado;
    private String CEP;
    private String cidade;
    private int numero;
    private String complemento;


}
