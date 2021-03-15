package com.example.eatverygood.controller;

import com.example.eatverygood.models.Plats;
import com.example.eatverygood.services.PlatsService;
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
@RequestMapping(value="/plats")
public class PlatsController {
    private PlatsService platService ;
    
    public PlatsController(PlatsService platsService){  
        this.platService = platsService;
    }
    
    @GetMapping
    public List<Plats> getAllPlats(){
        return this.platService.getAllPlats();
    };
    
    @PostMapping
    public Plats save(@RequestBody Plats plats){ 
        return this.platService.addPlats(plats);
    };
    
    @PutMapping
    public Plats update(@RequestBody Plats plats) {
        return this.platService.updatePlats(plats);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        this.platService.deletePlats(id);
    };
    
    
} 
