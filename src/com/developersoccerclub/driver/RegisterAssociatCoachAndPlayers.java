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
        
        Player player01 = new Player("SAMUEL", "A M SILVA", "474.728.255-73", "98.876.22-92", DateUtil.StringToDate("07/09/2011"));
        Player player02 = new Player("ARTHUR", "A M SILVA", "174.398.265-92", "27.876.58-91", DateUtil.StringToDate("03/03/2020"));
        
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
        
        em.persist(coach);
        
        em.getTransaction().commit();
        JpaUtil.closeConnection();
    }
}
