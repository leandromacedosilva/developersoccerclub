package com.developersoccerclub.model;

/**
 *
 * @author leandro
 */
public class Eddress {
    private Long id;
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String uf;
    private String pais;
    
    public Eddress() {}

    public Eddress(Long id, String rua, int numero, String bairro, String cidade, String uf, String pais) {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.pais = pais;
    }

    public Eddress(String rua, int numero, String bairro, String cidade, String uf, String pais) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.pais = pais;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Eddress{" + "id=" + id + ", rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", cidade=" + cidade + ", uf=" + uf + ", pais=" + pais + '}';
    }
    
    
}
