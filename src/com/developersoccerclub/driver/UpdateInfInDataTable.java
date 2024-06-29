package com.developersoccerclub.driver;

import com.developersoccerclub.model.Player;
import com.developersoccerclub.model.util.JpaUtil;
import javax.persistence.EntityManager;

/**
 *
 * @author leandro
 */
public class UpdateInfInDataTable {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.openConnection();
        em.getTransaction().begin();
        Player player = em.find(Player.class, 201L);
        System.out.println("Saida antes: " + player);
        player.setNome("RAIMUNDO");
        em.merge(player);
        System.out.println("Saida depois: " + player);
        em.getTransaction().commit();
        JpaUtil.closeConnection();
    }
}
