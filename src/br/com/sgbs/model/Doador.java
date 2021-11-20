/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sgbs.model;

/**
 *
 * @author Roberto Coutinho
 */
public class Doador {
    private int idDoador;
    private String nome;
    private String nomePai;
    private String nomeMae;
    private String dataAniversario;
    private String numeroTelefone;
    private String sexo;
    private String email;
    private String grupoSanguineo;
    private String cidade;
    private String endereco;

    public Doador(int idDoador, String nome, String nomePai, String nomeMae, String dataAniversario, String numeroTelefone, String sexo, String email, String grupoSanguineo, String cidade, String endereco) {
        this.idDoador = idDoador;
        this.nome = nome;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.dataAniversario = dataAniversario;
        this.numeroTelefone = numeroTelefone;
        this.sexo = sexo;
        this.email = email;
        this.grupoSanguineo = grupoSanguineo;
        this.cidade = cidade;
        this.endereco = endereco;
    }

    public int getIdDoador() {
        return idDoador;
    }

    public void setIdDoador(int idDoador) {
        this.idDoador = idDoador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
    
}
