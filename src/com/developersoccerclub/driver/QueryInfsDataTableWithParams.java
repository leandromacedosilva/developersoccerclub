package com.developersoccerclub.driver;

import com.developersoccerclub.model.Player;
import com.developersoccerclub.model.util.JpaUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author leandro
 */
public class QueryInfsDataTableWithParams {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.openConnection();
        em.getTransaction().begin();
        String query = "SELECT p FROM Player p WHERE LOWER(p.nome) LIKE :nome";
        Query queryh = em.createQuery(query);
        queryh.setParameter("nome", "%ar%");
        List<Player> players = queryh.getResultList();
        //List<Player> players = em.createQuery(query).getResultList();
        System.out.println("" + players);
        em.getTransaction().commit();
        JpaUtil.closeConnection();
    }
}
