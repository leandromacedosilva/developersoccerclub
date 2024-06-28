package com.developersoccerclub.driver;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author itccolina
 */
public class CreateTable {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DeveloperSoccerClubPU");
        
        emf.close();
    }
}
