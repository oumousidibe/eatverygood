
package com.example.eatverygood.services.impl;

import com.example.eatverygood.Repository.CommandeRepository;
import com.example.eatverygood.models.Commande;
import com.example.eatverygood.services.CommandeService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CommandeServiceImpl implements CommandeService{
    private CommandeRepository commandeRepository;
    
    public CommandeServiceImpl(CommandeRepository repository){
        this.commandeRepository = repository;
    };
    
    @Override
    public List<Commande> getAllCommande() {
        return this.commandeRepository.findAll();
        
    }
    

    @Override
    public void deleteCommande(Long id) {
        this.commandeRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("commande not found")); //pour lancer une exeption
        this.commandeRepository.deleteById(id);
    }

   
    @Override
    public Commande addCommande(Commande commande) {
        return this.commandeRepository.save(commande);
    }

    @Override
    public Commande updateCommande(Commande commande) {
        return this.commandeRepository.findById(commande.getId())
                .map(commande1 -> {
                   return this.commandeRepository.saveAndFlush(commande);
                }) 
                .orElseThrow(()-> new RuntimeException("update wrng : commande not found")); 
    }
    
}


