package com.developersoccerclub.driver;

import com.developersoccerclub.model.Coach;
import com.developersoccerclub.model.Eddress;
import com.developersoccerclub.model.Player;
import com.developersoccerclub.model.Salary;
import com.developersoccerclub.model.util.JpaUtil;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author itccolina
 */
public class InsertDataInTable {
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        PrintStream so = System.out;
        
        so.println("INFORME OS DADOS DO ENDERECO");
        so.print("RUA: ");
        String rua = input.nextLine();
        so.print("NUMERO: ");
        int numero = input.nextInt();
        input.nextLine();
        so.print("BAIRRO: ");
        String bairro = input.nextLine();
        so.print("CIDADE: ");
        String cidade = input.nextLine();
        so.print("UF: ");
        String uf = input.nextLine();
        so.print("PAIS: ");
        String pais = input.nextLine();
        
        Eddress eddress = new Eddress(rua, numero, bairro, cidade, uf, pais);
        
        so.println("INFORME OS DADOS DO SALARIO");
        so.print("SALARIO: ");
        float valor = input.nextFloat();
        so.print("INSS: ");
        float inss = input.nextFloat();
        so.print("IR: ");
        float ir = input.nextFloat();
        so.print("FIFA: ");
        Float fifa = input.nextFloat();
        so.print("CBF: ");
        Float cbf = input.nextFloat();
        
        Salary salary = new Salary(valor, inss, ir, fifa, cbf);
        
        so.println("INFORME OS DADOS DO JOGADOR");
        
        so.print("NOME: ");
        input.nextLine();
        String nome = input.nextLine();
        
        so.print("SOBRENOME: ");
        String sobrenome = input.nextLine();
        
        so.print("CPF: ");
        String cpf = input.nextLine();
        
        so.print("POSICAO: ");
        String posicao = input.nextLine();
                
        Player player = new Player(nome, sobrenome, cpf, posicao);
        //player.setSalary(salary);
        //player.setCoach(coach);
        //player.setEddress(eddress);
        
        so.println("INFORME OS DADOS DO TECNICO");
        so.print("NOME: ");
        String nome1 = input.nextLine();
        so.print("SOBRENOME: ");
        String sobrenome1 = input.nextLine();
        so.print("CPF: ");
        String cpf1 = input.nextLine();
        so.print("RG: ");
        String rg = input.nextLine();
                
        Coach coach = new Coach(nome1, sobrenome1, cpf1, rg);
        //coach.setSalary(salary);
        //coach.setPlayer(player);
        //coach.setEddress(eddress);
        
        EntityManager em = JpaUtil.openConnection();
        em.getTransaction().begin();
        em.persist(eddress);
        em.persist(salary);
        em.persist(player);
        em.persist(coach);
        em.getTransaction().commit();
        
        JpaUtil.closeConnection();
    }
}
