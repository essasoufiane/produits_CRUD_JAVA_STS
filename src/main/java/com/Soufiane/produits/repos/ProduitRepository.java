package com.Soufiane.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Soufiane.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
