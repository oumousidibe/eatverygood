package com.example.eatverygood.Repository;
import com.example.eatverygood.models.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;    
   


public interface CommandeRepository extends JpaRepository<Commande, Long> {

    public Commande findByName(String commande);
}
