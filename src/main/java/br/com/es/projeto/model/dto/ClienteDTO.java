package br.com.es.projeto.model.dto;

import lombok.*;

import java.io.Serializable;


public class ClienteDTO implements Serializable {

    private Long id;
    private String nome;
    private String cpf;
    private EnderecoDTO enderecoDTO;

    public ClienteDTO() {
    }

    public ClienteDTO(Long id, String nome, String cpf, EnderecoDTO enderecoDTO) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.enderecoDTO = enderecoDTO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public EnderecoDTO getEnderecoDTO() {
        return enderecoDTO;
    }

    public void setEnderecoDTO(EnderecoDTO enderecoDTO) {
        this.enderecoDTO = enderecoDTO;
    }

    @Override
    public String toString() {
        return "ClienteDTO{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", enderecoDTO=" + enderecoDTO +
                '}';
    }
}

