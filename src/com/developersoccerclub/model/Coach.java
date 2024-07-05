package com.developersoccerclub.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
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
    private String nome2;
    private String sobrenome2;
    private String cpf2;
    private String rg;
    @OneToOne(cascade = CascadeType.ALL)
    private Salary salary;
    @OneToMany
    private List<Player> players;
    @OneToOne(cascade = CascadeType.ALL)
    private Address eddress;
    
    public Coach() {}

    public Coach(Long id, String nome2, String sobrenome2, String cpf2, String rg, Salary salary, List<Player> players, Address eddress) {
        this.id = id;
        this.nome2 = nome2;
        this.sobrenome2 = sobrenome2;
        this.cpf2 = cpf2;
        this.rg = rg;
        this.salary = salary;
        this.players = players;
        this.eddress = eddress;
    }

    public Coach(String nome2, String sobrenome2, String cpf2, String rg) {
        this.nome2 = nome2;
        this.sobrenome2 = sobrenome2;
        this.cpf2 = cpf2;
        this.rg = rg;
    }

    public Coach(String nome2, String sobrenome2, String cpf2, String rg, Salary salary, List<Player> players, Address eddress) {
        this.nome2 = nome2;
        this.sobrenome2 = sobrenome2;
        this.cpf2 = cpf2;
        this.rg = rg;
        this.salary = salary;
        this.players = players;
        this.eddress = eddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome2() {
        return nome2;
    }

    public void setNome2(String nome2) {
        this.nome2 = nome2;
    }

    public String getSobrenome2() {
        return sobrenome2;
    }

    public void setSobrenome2(String sobrenome2) {
        this.sobrenome2 = sobrenome2;
    }

    public String getCpf2() {
        return cpf2;
    }

    public void setCpf2(String cpf2) {
        this.cpf2 = cpf2;
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

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    

    public Address getEddress() {
        return eddress;
    }

    public void setEddress(Address eddress) {
        this.eddress = eddress;
    }

    @Override
    public String toString() {
        return "Coach{" + "id=" + id + ", nome2=" + nome2 + ", sobrenome2=" + sobrenome2 + ", cpf1=" + cpf2 + ", rg=" + rg + ", salary=" + salary + ", players=" + players + ", eddress=" + eddress + '}';
    }

    

    
    
    
}
