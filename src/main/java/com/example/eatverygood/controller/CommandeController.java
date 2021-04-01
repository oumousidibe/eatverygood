
package com.example.eatverygood.controller;

import com.example.eatverygood.models.Commande;
import com.example.eatverygood.services.CommandeService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("commande")
public class CommandeController {
    private CommandeService commandeService;
    public CommandeController(CommandeService commandeService){
        this.commandeService=commandeService;
    }
    
    @GetMapping
    public List<Commande> getAllCommande(){
        return this.commandeService.getAllCommande();
    }
    
    @PostMapping
    public Commande save(@RequestBody Commande commande){
        return this.commandeService.addCommande(commande);
    }
    
    @PutMapping
    public Commande update(@RequestBody Commande commande){
        return this.commandeService.updateCommande(commande);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        this.commandeService.deleteCommande(id);
    }
}
