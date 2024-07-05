package com.developersoccerclub.driver;

import com.developersoccerclub.model.Coach;
import com.developersoccerclub.model.Player;
import com.developersoccerclub.model.util.DateUtil;
import com.developersoccerclub.model.util.JpaUtil;
import java.io.PrintStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;

/**
 *
 * @author leandro
 */
public class RegisterAssociatCoachAndPlayers {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        PrintStream so = System.out;
        
        so.println("INFORME OS DADOS DO JOGADOR");
        
        so.print("NOME: ");
        input.nextLine();
        String nome = input.nextLine();
        
        so.print("SOBRENOME: ");
        String sobrenome = input.nextLine();
        
        so.print("CPF: ");
        String cpf = input.nextLine();
        
        so.print("POSICAO: ");
        String posicao = input.nextLine();
        
        so.print("DATA: ");
        String dateRegister = input.nextLine();
                
        Player player01 = new Player(nome, sobrenome, cpf, posicao, DateUtil.StringToDate(dateRegister));
        
        so.println("INFORME OS DADOS DO JOGADOR");
        
        so.print("NOME: ");
        input.nextLine();
        String nome1 = input.nextLine();
        
        so.print("SOBRENOME: ");
        String sobrenome1 = input.nextLine();
        
        so.print("CPF: ");
        String cpf1 = input.nextLine();
        
        so.print("POSICAO: ");
        String posicao1 = input.nextLine();
        
        so.print("DATA: ");
        String dateRegister1 = input.nextLine();
                
        Player player02 = new Player(nome1, sobrenome1, cpf1, posicao1, DateUtil.StringToDate(dateRegister1));
        
        List<Player> players = new ArrayList<>();
        players.add(player01);
        players.add(player02);
        
        so.println("INFORME OS DADOS DO TECNICO");
        so.print("NOME: ");
        String nome2 = input.nextLine();
        so.print("SOBRENOME: ");
        String sobrenome2 = input.nextLine();
        so.print("CPF: ");
        String cpf2 = input.nextLine();
        so.print("RG: ");
        String rg = input.nextLine();
                
        Coach coach = new Coach(nome2, sobrenome2, cpf2, rg);
        coach.setPlayers(players);
        
        EntityManager em = JpaUtil.openConnection();
        em.getTransaction().begin();
        for(Player p : players) {
            em.persist(p);
        }
        em.getTransaction().commit();
        JpaUtil.closeConnection();
    }
}
