package com.example.eatverygood.services;
import com.example.eatverygood.models.Partenaire;
import java.util.List;

public interface PartenaireService {
    public List<Partenaire> getAllPartenaire(); 
    public void deletePartenaire(Long id);
    public Partenaire addPartenaire(Partenaire partenaire);
    public Partenaire updatePartenaire(Partenaire partenaire);

}


