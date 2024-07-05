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
        Player player03 = new Player("LEANDRO", "M SILVA", "009.188.365-11", "95.876.96-09", DateUtil.StringToDate("17/08/2019"));
        Player player04 = new Player("RODRIGO", "FEITOSA", "660.250.580-64", "02.676.18-73", DateUtil.StringToDate("14/05/2021"));
        Player player05 = new Player("KALBI", "OLIVEIRA", "174.398.265-92", "25.732.64-67", DateUtil.StringToDate("08/09/2022"));
        
        List<Player> players = new ArrayList<>();
        players.add(player01);
        players.add(player02);
        players.add(player03);
        players.add(player04);
        players.add(player05);
        
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
