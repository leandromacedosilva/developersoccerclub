package com.developersoccerclub.driver;

import com.developersoccerclub.model.Player;
import com.developersoccerclub.model.util.DateUtil;
import com.developersoccerclub.model.util.JpaUtil;
import java.text.ParseException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author leandro
 */
public class QueryInfsDataTableForDateWithBetween {
    public static void main(String[] args) throws ParseException {
        EntityManager em = JpaUtil.openConnection();
        em.getTransaction().begin();
        String query = "SELECT p FROM Player p WHERE p.dateRegister BETWEEN :dateRegisterI AND :dateRegisterF";
        Query queryh = em.createQuery(query);
        queryh.setParameter("dateRegisterI", DateUtil.StringToDate("01/11/2019"));
        queryh.setParameter("dateRegisterF", DateUtil.StringToDate("01/05/2021"));
        List<Player> players = queryh.getResultList();
        System.out.println("" + players);
        em.getTransaction().commit();
        JpaUtil.closeConnection();
    }
}
