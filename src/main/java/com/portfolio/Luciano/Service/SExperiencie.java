package com.portfolio.Luciano.Service;

import com.portfolio.Luciano.Entity.Experiencie;
import com.portfolio.Luciano.Repository.RExperiencie;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//persiste la info en la base de datos!
@Transactional
public class SExperiencie {
    @Autowired
    RExperiencie rExperiencie;
    
    public List<Experiencie> list(){
       return rExperiencie.findAll(); 
    }
    
    public Optional<Experiencie> getOne(int id){
        return rExperiencie.findById(id);
    }
    
    public Optional<Experiencie> getByNombreE(String nombreE){
        return rExperiencie.findByNombreE(nombreE);
    }
    
    public void save(Experiencie experiencie){
        rExperiencie.save(experiencie);
    }
    
    public void delete(int id){
        rExperiencie.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rExperiencie.existsById(id);
    }
    
    public boolean existsByNombreE(String nombreE){
        return rExperiencie.existsByNombreE(nombreE);
    }
}
