package com.developersoccerclub.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author leandro
 */

@Entity
@Table(name = "tbreferee")
@SequenceGenerator(name = "seq_tbreferee", sequenceName = "seq_tbreferee", initialValue = 1)
public class Referee implements Serializable {
    @Id
    @GeneratedValue(generator = "seq_tbreferee", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome;
    private String sobrenome;
    private String cpf;
    //private Match
    @OneToOne(cascade = CascadeType.ALL) 
    private Address address;
    @OneToOne(cascade = CascadeType.ALL)
    private Contact contact;
    @OneToOne(cascade = CascadeType.ALL)
    private Salary salary;
    
    public Referee () {}

    public Referee(Long id, String nome, String sobrenome, String cpf, Address address, Contact contact, Salary salary) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.address = address;
        this.contact = contact;
        this.salary = salary;
    }

    public Referee(String nome, String sobrenome, String cpf, Address address, Contact contact, Salary salary) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.address = address;
        this.contact = contact;
        this.salary = salary;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Referee{" + "id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", cpf=" + cpf + ", address=" + address + ", contact=" + contact + ", salary=" + salary + '}';
    }
    
}
