package com.developersoccerclub.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author leandro
 */
@Entity
@Table(name = "tbcontact")
@SequenceGenerator(name = "seq_tbcontact", sequenceName = "seq_tbcontact", initialValue = 1)
public class Contact implements Serializable {
    @Id
    @GeneratedValue(generator = "seq_tbcontact", strategy = GenerationType.SEQUENCE)
    private Long id;
    private int dd;
    private String calular;
    private String fixo;
    private String email;
    
    public Contact() {}

    public Contact(Long id, int dd, String calular, String fixo, String email) {
        this.id = id;
        this.dd = dd;
        this.calular = calular;
        this.fixo = fixo;
        this.email = email;
    }

    public Contact(int dd, String calular, String fixo, String email) {
        this.dd = dd;
        this.calular = calular;
        this.fixo = fixo;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }

    public String getCalular() {
        return calular;
    }

    public void setCalular(String calular) {
        this.calular = calular;
    }

    public String getFixo() {
        return fixo;
    }

    public void setFixo(String fixo) {
        this.fixo = fixo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" + "id=" + id + ", dd=" + dd + ", calular=" + calular + ", fixo=" + fixo + ", email=" + email + '}';
    }
    
    
    
}
