package com.developersoccerclub.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
    @OneToOne
    private Salary salary;
    @OneToOne
    private Coach coach;
    @OneToOne
    private Eddress eddress;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRegister;
    
    public Player() {}

    public Player(Long id, String nome, String sobrenome, String cpf, String posicao, Salary salary, Coach coach, Eddress eddress, Date dateRegister) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.posicao = posicao;
        this.salary = salary;
        this.coach = coach;
        this.eddress = eddress;
        this.dateRegister = dateRegister;
    }

    public Player(String nome, String sobrenome, String cpf, String posicao, Date dateRegister) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.posicao = posicao;
        this.dateRegister = dateRegister;
    }
    
    public Player(String nome, String sobrenome, String cpf, String posicao, Salary salary, Coach coach, Eddress eddress, Date dateRegister) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.posicao = posicao;
        this.salary = salary;
        this.coach = coach;
        this.eddress = eddress;
        this.dateRegister = dateRegister;
    }

    public void playerInform() {
        System.out.println("CODIGO: " + this.id);
        System.out.println("NOME: " + this.nome);
        System.out.println("SOBRENOME: " + this.sobrenome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("POSICAO: " + this.posicao);
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

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public Eddress getEddress() {
        return eddress;
    }

    public void setEddress(Eddress eddress) {
        this.eddress = eddress;
    }

    public Date getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(Date dateRegister) {
        this.dateRegister = dateRegister;
    }

    @Override
    public String toString() {
        return "Player{" + "id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", cpf=" + cpf + ", posicao=" + posicao + ", salary=" + salary + ", coach=" + coach + ", eddress=" + eddress + ", dateRegister=" + dateRegister + '}';
    }
    
}
