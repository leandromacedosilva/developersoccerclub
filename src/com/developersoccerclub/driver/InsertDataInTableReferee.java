package com.developersoccerclub.driver;

import com.developersoccerclub.model.Address;
import com.developersoccerclub.model.Contact;
import com.developersoccerclub.model.Referee;
import com.developersoccerclub.model.Salary;
import com.developersoccerclub.model.util.JpaUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author leandro
 */
public class InsertDataInTableReferee {
    public static void main(String[] args) {
              
        EntityManager em = JpaUtil.openConnection();
        em.getTransaction().begin();
        
        Address endereco001 = new Address("Raimundo Silva", 3728, "Nuce Braga", "Jardim", "PB", "Brasil");
        Address endereco002 = new Address("Oswald Sousa", 1192, "Paulo Freirer", "Dondoca", "RN", "Brasil");
        Address endereco003 = new Address("Rui Grilo", 3728, "Helio Fonseca", "Cumaru", "AL", "Brasil");
        Address endereco004 = new Address("Vicente Neto", 3728, "Monte Claro", "Pedra Grande", "MG", "Brasil");
        Address endereco005 = new Address("Maria Urca", 3728, "Jadim Belo", "Odiceia", "BA", "Brasil");
        //em.persist(endereco);
        
        List<Address> addresss = new ArrayList<>();
        addresss.add(endereco001);
        addresss.add(endereco002);
        addresss.add(endereco003);
        addresss.add(endereco004);
        addresss.add(endereco005);
        
        Contact contato001 = new Contact(87, "982726152", "44256172", "fulano001@gmail.com");
        Contact contato002 = new Contact(32, "992811201", "10901768", "fulano002@gmail.com");
        Contact contato003 = new Contact(87, "972819910", "92819827", "fulano003@gmail.com");
        Contact contato004 = new Contact(87, "991872617", "01988244", "fulano004@gmail.com");
        Contact contato005 = new Contact(87, "738277188", "82718771", "fulano005@gmail.com");
        //em.persist(contato);
        
        List<Contact> contacts = new ArrayList<>();
        contacts.add(contato001);
        contacts.add(contato002);
        contacts.add(contato003);
        contacts.add(contato004);
        contacts.add(contato005);
        
        Salary salario001 = new Salary(62722f);
        Salary salario002 = new Salary(92889f);
        Salary salario003 = new Salary(100292f);
        Salary salario004 = new Salary(192892f);
        Salary salario005 = new Salary(782991f);
        //em.persist(salario);
        List<Salary> salarys = new ArrayList<>();
        salarys.add(salario001);
        salarys.add(salario002);
        salarys.add(salario003);
        salarys.add(salario004);
        salarys.add(salario005);
        
        
        Referee arbitro001 = new Referee("Claudio", "Julio", "827.225.198-11", endereco001, contato001, salario001);
        Referee arbitro002 = new Referee("Guga", "Folio", "939.936.229.-54", endereco002, contato002, salario002);
        Referee arbitro003 = new Referee("Adeiano", "Oliveira", "920.374.773-26", endereco003, contato003, salario003);
        Referee arbitro004 = new Referee("Tulio", "Cascata", "736.665.732-83", endereco004, contato004, salario004);
        Referee arbitro005 = new Referee("Willian", "castro", "882.711.287-65", endereco005, contato005, salario005);
        
//        arbitro.setNome("Manoel");
//        arbitro.setSobrenome("Feitosa");
//        arbitro.setCpf("728.290.182-90");
//        arbitro.setAddress(endereco);
//        arbitro.setContact(contato);
//        arbitro.setSalary(salario);   
        
        em.persist(arbitro001);
        em.persist(arbitro002);
        em.persist(arbitro003);
        em.persist(arbitro004);
        em.persist(arbitro005);
        
        em.getTransaction().commit();
        JpaUtil.closeConnection();
    }
}
