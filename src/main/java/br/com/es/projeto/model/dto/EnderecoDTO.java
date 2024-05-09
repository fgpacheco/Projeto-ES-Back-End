package br.com.es.projeto.model.dto;

import lombok.*;

import java.io.Serializable;

public class EnderecoDTO implements Serializable {

    private String logradouro;
    private Integer numero;
    private String estado;
    private String cidade;
    private String cep;

    public EnderecoDTO() {
    }

    public EnderecoDTO(String logradouro, Integer numero, String estado, String cidade, String cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.estado = estado;
        this.cidade = cidade;
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "EnderecoDTO{" +
                "logradouro='" + logradouro + '\'' +
                ", numero=" + numero +
                ", estado='" + estado + '\'' +
                ", cidade='" + cidade + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }
}
