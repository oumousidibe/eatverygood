package com.example.eatverygood.Repository;
import com.example.eatverygood.models.Partenaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; 

@Repository
public interface PartenaireRepository extends JpaRepository<Partenaire, Long> {
    public Partenaire findByName(String NamePartenaire);
}
