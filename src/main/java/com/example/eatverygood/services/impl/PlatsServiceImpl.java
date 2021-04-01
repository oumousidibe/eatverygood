package com.example.eatverygood.services.impl;
import com.example.eatverygood.Repository.PlatsRepository;
import com.example.eatverygood.models.Plats;
import com.example.eatverygood.services.PlatsService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PlatsServiceImpl implements PlatsService{
    private PlatsRepository platsRepository;
    
    public PlatsServiceImpl(PlatsRepository repository){
        this.platsRepository = repository;
    };
    
    @Override
    public List<Plats> getAllPlats() {
        return this.platsRepository.findAll();
        
    }
    

    @Override
    public void deletePlats(Long id) {
        this.platsRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("plats not found")); //pour lancer une exeption
        this.platsRepository.deleteById(id);
    }

   
    @Override
    public Plats addPlats(Plats plats) {
        return this.platsRepository.save(plats);
    }

    @Override
    public Plats updatePlats(Plats plats) {
        return this.platsRepository.findById(plats.getId())
                .map(plats1 -> {
                   return this.platsRepository.saveAndFlush(plats);
                }) 
                .orElseThrow(()-> new RuntimeException("update wrng : plats not found")); 
    }
    
}




