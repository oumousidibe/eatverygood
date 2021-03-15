package com.example.eatverygood.services;
import com.example.eatverygood.models.Menu;
import java.util.List;

public interface MenuService {
    public List<Menu> getAllMenu(); 
    public void deleteMenu(Long id);
    public Menu addMenu(Menu menu);
    public Menu updateMenu(Menu menu);

}

