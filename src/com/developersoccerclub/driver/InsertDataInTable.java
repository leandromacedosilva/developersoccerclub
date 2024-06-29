package com.developersoccerclub.driver;

import com.developersoccerclub.model.Player;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author itccolina
 */
public class InsertDataInTable {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DeveloperSoccerClubPU");
        
        Scanner input = new Scanner(System.in);
        PrintStream so = System.out;
        
        so.println("INFORME OS DADOS DO JOGADOR");
        so.print("NOME: ");
        String nome = input.nextLine();
        so.print("SOBRENOME: ");
        String sobrenome = input.nextLine();
        so.print("CPF: ");
        String cpf = input.nextLine();
        so.print("POSICAO: ");
        String posicao = input.nextLine();
        so.print("SALARIO: ");
        Float salario = input.nextFloat();
        
        Player player = new Player(nome, sobrenome, cpf, posicao, salario);
                
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        
            em.persist(player);
        
        
        em.getTransaction().commit();
        
        emf.close();
    }
}
