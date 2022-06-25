package com.Soufiane.produits;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Soufiane.produits.entities.Produit;
import com.Soufiane.produits.repos.ProduitRepository;

@SpringBootTest
class ProduitsApplicationTests {

	@Autowired
	private ProduitRepository produitRepository;
	
	@Test
	public void testCreateProduit() {
	Produit prod = new Produit("PC daouda",1250.500,new Date());
	produitRepository.save(prod);
	}
	
	@Test
	public void testFindProduit()
	{
	Produit p = produitRepository.findById(1L).get();
	System.out.println(p);
	}
	
	@Test
	public void testUpdateProduit()
	{
	Produit p = produitRepository.findById(1L).get();
	p.setPrixProduit(2500.0);
	produitRepository.save(p);
	
	System.out.println(p);
	}
	
	@Test
	public void testDeleteProduit()
	{
		produitRepository.deleteById(1L);
	}
	
	@Test
	public void testFindAllProduits()
	{
		List<Produit> prods = produitRepository.findAll();
		
		for (Produit p:prods)
			 System.out.println(p);
		
	}

}
