package crud.trabalhoprofessorandreendtoend.DTOs;


import jakarta.validation.constraints.NotNull;
public record DadosEnderecoDTO( @NotNull
                                String logradouro,
                                String bairro,
                                String estado,
                                String cep,
                                String cidade,
                                int numero,
                                String complemento) {


}
