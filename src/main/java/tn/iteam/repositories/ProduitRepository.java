package tn.iteam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.iteam.entities.Produit;
@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long>{

}
