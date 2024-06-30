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
@Table(name = "tbsalary")
@SequenceGenerator(name = "seq_tbsalary", sequenceName = "seq_tbsalary", initialValue = 1)
public class Salary implements Serializable {
    @Id
    @GeneratedValue(generator = "seq_tbsalary", strategy = GenerationType.SEQUENCE)
    private Long id;
    private float valor;
    // value = 8% of salary
    private float inss;
    // value = 7% of salary
    private float ir;
    // value = 6% of salary
    private float fifa;
    // value = 5% of salary
    private float cbf;
    
    public Salary() {}

    public Salary(Long id, float valor, float inss, float ir, float fifa, float cbf) {
        this.id = id;
        this.valor = valor;
        this.inss = inss;
        this.ir = ir;
        this.fifa = fifa;
        this.cbf = cbf;
    }

    public Salary(float valor, float inss, float ir, float fifa, float cbf) {
        this.valor = valor;
        this.inss = inss;
        this.ir = ir;
        this.fifa = fifa;
        this.cbf = cbf;
    }
    
    public void descontos() {
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getInss() {
        return inss;
    }

    public void setInss(float inss) {
        this.inss = inss;
    }

    public float getIr() {
        return ir;
    }

    public void setIr(float ir) {
        this.ir = ir;
    }

    public float getFifa() {
        return fifa;
    }

    public void setFifa(float fifa) {
        this.fifa = fifa;
    }

    public float getCbf() {
        return cbf;
    }

    public void setCbf(float cbf) {
        this.cbf = cbf;
    }

    @Override
    public String toString() {
        return "Salary{" + "id=" + id + ", valor=" + valor + ", inss=" + inss + ", ir=" + ir + ", fifa=" + fifa + ", cbf=" + cbf + '}';
    }
    
    
}
