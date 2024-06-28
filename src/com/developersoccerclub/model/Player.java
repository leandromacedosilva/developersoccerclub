package com.developersoccerclub.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author leandro
 */
@Entity
@Table(name = "tbplayer")
public class Player implements Serializable {
    @Id
    private Long id;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String posicao;
    private float salario;
}
