/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

/**
 *
 * @author neves
 */
//TestaInsereProduto.java
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Produto;

public class TestaInsereProduto {

public static void main(String[] args)
{
EntityManagerFactory factory = Persistence.createEntityManagerFactory("lojavirtualDB");
EntityManager em = factory.createEntityManager();

Produto p = new Produto();
p.setNome("camiseta");
p.setPreco(12.23);

em.getTransaction().begin();

em.persist(p);

em.getTransaction().commit();
}
}