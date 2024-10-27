package crud.trabalhoprofessorandreendtoend.usuarios;

import crud.trabalhoprofessorandreendtoend.usuarios.TipoDeAcesso.TipoDeAcesso;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Tabela de Usuarios Administradores")
@Entity(name = "UsuariosAdministradores")
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuarioAdministrador;
    private String nomeUsuarioAdministrador;
    private String senha;
    @DateTimeFormat
    private LocalDate dtCadastro;
    private TipoDeAcesso tipoDeAcesso;
}
