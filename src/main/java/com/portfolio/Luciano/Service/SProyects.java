package com.portfolio.Luciano.Service;

import com.portfolio.Luciano.Entity.Proyects;
import com.portfolio.Luciano.Repository.RProyects;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyects {
    
    @Autowired
    RProyects rProyects;
    
    public List<Proyects> list(){
       return rProyects.findAll(); 
    }
    
    public Optional<Proyects> getOne(int id){
        return rProyects.findById(id);
    }
    
    public Optional<Proyects> getByNombre(String nombre){
        return rProyects.findByNombre(nombre);
    }
    
    public void save(Proyects proyects){
        rProyects.save(proyects);
    }
    
    public void delete(int id){
        rProyects.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rProyects.existsById(id);
    }
    
    public boolean existsByNombre(String nombre){
        return rProyects.existsByNombre(nombre);
    }
}
