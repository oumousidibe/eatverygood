package com.example.eatverygood.Repository;
import com.example.eatverygood.models.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; 


public interface MenuRepository extends JpaRepository<Menu, Long> {
    
     //   public Menu findByName(String NameMenu); 

    
}
