package crud.trabalhoprofessorandreendtoend.agenda;

import crud.trabalhoprofessorandreendtoend.Servico.Servico;
import crud.trabalhoprofessorandreendtoend.cliente.Cliente;
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
@Table(name = "Tabela de Agendamento")
@Entity(name = "Agenda")
public class Agenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAgenda;
    private String descriccao;
    private Servico servico;
    @DateTimeFormat
    private LocalDate dataDoAgendamento;
    private Cliente cliente;
    //private UsuarioAdministrador usuarioAdministrador;


}
