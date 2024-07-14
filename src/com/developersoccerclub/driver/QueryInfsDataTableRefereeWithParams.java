package com.developersoccerclub.driver;

import com.developersoccerclub.model.Referee;
import com.developersoccerclub.model.util.JpaUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author leandro
 */
public class QueryInfsDataTableRefereeWithParams {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.openConnection();
        em.getTransaction().begin();
        
        String query = "select r.nome,r.sobrenome,r.cpf,a.rua,a.cidade,a.bairro from Referee r INNER JOIN Address a ON r.id = :id";
                Query queryh = em.createQuery(query);
                queryh.setParameter("id", 51);
                List<Referee> referees = queryh.getResultList();
                System.out.println("RESULTADO" + referees);
        em.getTransaction().commit();
        JpaUtil.closeConnection();
    }
}
