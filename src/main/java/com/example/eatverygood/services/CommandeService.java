package com.example.eatverygood.services;
import com.example.eatverygood.models.Commande;
import java.util.List;

public interface CommandeService {
    public List<Commande> getAllCommande(); 
    public void deleteCommande(Long id);
    public Commande addCommande(Commande commande);
    public Commande updateCommande(Commande commande);

}


