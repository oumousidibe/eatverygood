package com.example.eatverygood.Repository;

import com.example.eatverygood.models.Plats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; 

@Repository
public interface PlatsRepository extends JpaRepository<Plats, Long> {
        public Plats findByName(String NamePlats);

    
}
