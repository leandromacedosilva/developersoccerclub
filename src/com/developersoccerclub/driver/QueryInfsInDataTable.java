package com.developersoccerclub.driver;

import com.developersoccerclub.model.Player;
import com.developersoccerclub.model.util.JpaUtil;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author leandro
 */
public class QueryInfsInDataTable {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.openConnection();
        em.getTransaction().begin();
        
        //String query = "SELECT p FROM Player p";
        //String query = "SELECT p FROM Player p WHERE p.id = 301";
        String query = "SELECT p FROM Player p WHERE p.nome LIKE '%A%'";
        List<Player> players = 
        em.createQuery(query).getResultList();
        System.out.println("Saida: " + players);
        em.getTransaction().commit();
        JpaUtil.closeConnection();
    }
}
