package br.com.bitrama.CadastroDePersonagens.model;

import jakarta.persistence.*;

//Entity transforma uma classe em uma entidade no BD
@Entity
@Table(name = "tb_cadastro")
public class PersonagemModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    //Representa NoArgsConstructor (Construtor Vazio)
    public PersonagemModel() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Representa AllArgsConstructor (Construtor cheio)
    public PersonagemModel(String nome, String email, int idade){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
}

