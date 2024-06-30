package com.developersoccerclub.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author leandro
 */
@Entity
@Table(name = "tbplayer")
@SequenceGenerator(name = "seq_tbplayer", sequenceName = "seq_tbplayer", initialValue = 1)
public class Player implements Serializable {
    @Id
    @GeneratedValue(generator = "seq_tbplayer", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String posicao;
    private float salario;
    @OneToMany
    private Eddress eddress;
    
    public Player() {}

    public Player(Long id, String nome, String sobrenome, String cpf, String posicao, float salario) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.posicao = posicao;
        this.salario = salario;
    }

    public Player(Long id, String nome, String sobrenome, String cpf, String posicao, float salario, Eddress eddress) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.posicao = posicao;
        this.salario = salario;
        this.eddress = eddress;
    }
    
    

    public Player(String nome, String sobrenome, String cpf, String posicao, float salario, Eddress eddress) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.posicao = posicao;
        this.salario = salario;
        this.eddress = eddress;
    }
    
    

    public Player(String nome, String sobrenome, String cpf, String posicao, float salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.posicao = posicao;
        this.salario = salario;
    }
    
    public void playerInform() {
        System.out.println("CODIGO: " + this.id);
        System.out.println("NOME: " + this.nome);
        System.out.println("SOBRENOME: " + this.sobrenome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("POSICAO: " + this.posicao);
        System.out.println("SALARIO: " + this.salario);
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

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Eddress getEddress() {
        return eddress;
    }

    public void setEddress(Eddress eddress) {
        this.eddress = eddress;
    }

    @Override
    public String toString() {
        return "Player{" + "id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", cpf=" + cpf + ", posicao=" + posicao + ", salario=" + salario + ", eddress=" + eddress + '}';
    }
    
    

    
    
    
    
}
