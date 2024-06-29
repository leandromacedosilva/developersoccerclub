package com.developersoccerclub.model.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author leandro
 */
public class JpaUtil {
    private static final EntityManagerFactory emf;
    
    static {
        emf = Persistence.createEntityManagerFactory("DeveloperSoccerClubPU");
    }
    
    public static EntityManager openConnection() {
        return emf.createEntityManager();
    }
    
    public static void closeConnection() {
        emf.close();
    } 
}
