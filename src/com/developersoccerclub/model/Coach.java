package com.developersoccerclub.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author leandro
 */
@Entity
@Table(name = "tbcoach")
@SequenceGenerator(name = "seq_tbcoach", sequenceName = "seq_tbcoach", initialValue = 1)
public class Coach implements Serializable {
    @Id
    @GeneratedValue(generator = "seq_tbcoach", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome1;
    private String sobrenome1;
    private String cpf1;
    private String rg;
    @OneToOne
    private Salary salary;
    @OneToOne
    private Player player;
    @OneToOne
    private Eddress eddress;
    
    public Coach() {}

    public Coach(Long id, String nome1, String sobrenome1, String cpf1, String rg, Salary salary, Player player, Eddress eddress) {
        this.id = id;
        this.nome1 = nome1;
        this.sobrenome1 = sobrenome1;
        this.cpf1 = cpf1;
        this.rg = rg;
        this.salary = salary;
        this.player = player;
        this.eddress = eddress;
    }

    public Coach(String nome1, String sobrenome1, String cpf1, String rg) {
        this.nome1 = nome1;
        this.sobrenome1 = sobrenome1;
        this.cpf1 = cpf1;
        this.rg = rg;
    }
    
    public Coach(String nome1, String sobrenome1, String cpf1, String rg, Salary salary, Player player, Eddress eddress) {
        this.nome1 = nome1;
        this.sobrenome1 = sobrenome1;
        this.cpf1 = cpf1;
        this.rg = rg;
        this.salary = salary;
        this.player = player;
        this.eddress = eddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome1() {
        return nome1;
    }

    public void setNome1(String nome1) {
        this.nome1 = nome1;
    }

    public String getSobrenome1() {
        return sobrenome1;
    }

    public void setSobrenome1(String sobrenome1) {
        this.sobrenome1 = sobrenome1;
    }

    public String getCpf1() {
        return cpf1;
    }

    public void setCpf1(String cpf1) {
        this.cpf1 = cpf1;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Eddress getEddress() {
        return eddress;
    }

    public void setEddress(Eddress eddress) {
        this.eddress = eddress;
    }

    @Override
    public String toString() {
        return "Coach{" + "id=" + id + ", nome=" + nome1 + ", sobrenome=" + sobrenome1 + ", cpf=" + cpf1 + ", rg=" + rg + ", salary=" + salary + ", player=" + player + ", eddress=" + eddress + '}';
    }

    
    
    
}
