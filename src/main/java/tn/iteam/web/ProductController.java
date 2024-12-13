package tn.iteam.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import tn.iteam.entities.Produit;
import tn.iteam.repositories.ProduitRepository;

import java.util.List;

@Controller
public class ProductController {
    private final ProduitRepository produitRepository;

    public ProductController(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    @GetMapping("/index")
    public String index(Model model) {
        List<Produit> produitsAll = produitRepository.findAll();
        model.addAttribute("produits", produitsAll);
        return "produits";
    }
}
