
package com.example.eatverygood.controller;

import com.example.eatverygood.models.Partenaire;
import com.example.eatverygood.services.PartenaireService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/partenaire")
public class PartenaireController {
    private PartenaireService partenaireService;
    public PartenaireController(PartenaireService partenaireService){
        this.partenaireService=partenaireService;
    }
    
    @GetMapping
    public List<Partenaire> getAllPartenaire(){
        return this.partenaireService.getAllPartenaire();
    }
    
    @PostMapping
    public Partenaire save(@RequestBody Partenaire partenaire){
        return this.partenaireService.addPartenaire(partenaire);
    }
    
    @PutMapping
    public Partenaire update(@RequestBody Partenaire partenaire){
        return this.partenaireService.updatePartenaire(partenaire);
    }
    
    @DeleteMapping
    public void delete(@PathVariable Long id){
        this.partenaireService.deletePartenaire(id);
    }
}

