package com.developersoccerclub.driver;

import com.developersoccerclub.model.Player;
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
        
        Player player001 = new Player(1L, "Ronaldinho", "Bruxo", "888.888.888-88", "Atacante", 500000f);
        
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(player001);
        em.getTransaction().commit();
        
        emf.close();
    }
}
