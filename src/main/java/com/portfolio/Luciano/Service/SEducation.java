package com.portfolio.Luciano.Service;


import com.portfolio.Luciano.Entity.Education;
import com.portfolio.Luciano.Repository.REducation;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//persiste la info en la base de datos!
@Transactional
public class SEducation {
    @Autowired
    REducation rEducation;
    
    public List<Education> list(){
       return rEducation.findAll(); 
    }
    
    public Optional<Education> getOne(int id){
        return rEducation.findById(id);
    }
    
    public Optional<Education> getByNombreE(String nombreE){
        return rEducation.findByNombreE(nombreE);
    }
    
    public void save(Education experiencie){
        rEducation.save(experiencie);
    }
    
    public void delete(int id){
        rEducation.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rEducation.existsById(id);
    }
    
    public boolean existsByNombreE(String nombreE){
        return rEducation.existsByNombreE(nombreE);
    }
}
