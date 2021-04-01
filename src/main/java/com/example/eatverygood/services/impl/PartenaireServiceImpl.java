/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eatverygood.services.impl;
import com.example.eatverygood.services.PartenaireService;
import com.example.eatverygood.Repository.PartenaireRepository;
import com.example.eatverygood.models.Partenaire;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PartenaireServiceImpl implements PartenaireService{
    private PartenaireRepository partenaireRepository;
    
    public PartenaireServiceImpl(PartenaireRepository repository){
        this.partenaireRepository = repository;
    };
    
    @Override
    public List<Partenaire> getAllPartenaire() {
        return this.partenaireRepository.findAll();
        
    }
    

    @Override
    public void deletePartenaire(Long id) {
        this.partenaireRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("partenaire not found")); //pour lancer une exeption
        this.partenaireRepository.deleteById(id);
    }

   
    @Override
    public Partenaire addPartenaire(Partenaire partenaire) {
        return this.partenaireRepository.save(partenaire);
    }

    @Override
    public Partenaire updatePartenaire(Partenaire partenaire) {
        return this.partenaireRepository.findById(partenaire.getId())
                .map(partenaire1 -> {
                   return this.partenaireRepository.saveAndFlush(partenaire);
                }) 
                .orElseThrow(()-> new RuntimeException("update wrng : partenaire not found")); 
    }
    
}



