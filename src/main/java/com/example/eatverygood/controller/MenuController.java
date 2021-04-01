package com.example.eatverygood.controller;

import com.example.eatverygood.models.Menu;
import com.example.eatverygood.services.MenuService;
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
@RequestMapping("menu")
public class MenuController {
    private MenuService platService ;
    
    public MenuController(MenuService menuService){  
        this.platService = menuService;
    }
    
    @GetMapping
    public List<Menu> getAllMenu(){
        return this.platService.getAllMenu();
    };
    
    @PostMapping
    public Menu save(@RequestBody Menu menu){ 
        return this.platService.addMenu(menu);
    };
    
    @PutMapping
    public Menu update(@RequestBody Menu menu) {
        return this.platService.updateMenu(menu);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        this.platService.deleteMenu(id);
    };
    
    
} 
