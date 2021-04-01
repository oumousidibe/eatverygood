package com.example.eatverygood.services.impl;
import com.example.eatverygood.Repository.MenuRepository;
import com.example.eatverygood.models.Menu;
import com.example.eatverygood.services.MenuService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl implements MenuService{
    private MenuRepository menuRepository;
    
    public MenuServiceImpl(MenuRepository repository){
        this.menuRepository = repository;
    };
    
    @Override
    public List<Menu> getAllMenu() {
        return this.menuRepository.findAll();
        
    }
    

    @Override
    public void deleteMenu(Long id) {
        this.menuRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("menu not found")); //pour lancer une exeption
        this.menuRepository.deleteById(id);
    }

   
    @Override
    public Menu addMenu(Menu menu) {
        return this.menuRepository.save(menu);
    }

    @Override
    public Menu updateMenu(Menu menu) {
        return this.menuRepository.findById(menu.getId())
                .map(m-> {
                    return this.menuRepository.saveAndFlush(menu);
                })
                .orElseThrow(()-> new RuntimeException("update wrng : menu not found")); 
    }
    
}



