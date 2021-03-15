package com.example.eatverygood.services;
import com.example.eatverygood.models.Plats;
import java.util.List;

public interface PlatsService {
    public List<Plats> getAllPlats(); 
    public void deletePlats(Long id);
    public Plats addPlats(Plats plats);
    public Plats updatePlats(Plats plats);

}

