package crud.trabalhoprofessorandreendtoend.cliente;

import crud.trabalhoprofessorandreendtoend.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="tabela De Clientes")
@Entity(name="Clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomeDoCliente;
    private int telefoneDoCleinte;
    private String email;
    private Endereco enderecoDoCliente;
}
