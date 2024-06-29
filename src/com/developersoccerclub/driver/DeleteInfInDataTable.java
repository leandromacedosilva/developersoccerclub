package com.developersoccerclub.driver;

import com.developersoccerclub.model.Player;
import com.developersoccerclub.model.util.JpaUtil;
import javax.persistence.EntityManager;

/**
 *
 * @author leandro
 */
public class DeleteInfInDataTable {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.openConnection();
        em.getTransaction().begin();
        Player player = em.find(Player.class, 1L);
        System.out.println("Saida: " + player);
        em.remove(player);
        System.out.println("REGISTRO ACIMA DELETADO COM SUCESSO!");
        em.getTransaction().commit();
        JpaUtil.closeConnection();
    }
}
