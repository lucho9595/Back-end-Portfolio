package com.portfolio.Luciano.Service;

import com.portfolio.Luciano.Entity.Persona;
import com.portfolio.Luciano.Interface.IPersonaService;
import com.portfolio.Luciano.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService {

    @Autowired
    IPersonaRepository ipersonaRepository;

    @Override
    public List<Persona> getPersona() {
        //asignamos un parametro persona, que va a contener la lista Persona
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        //aca hacemos si lo encuentra lo returna, orElse(o si no) devolvemos null
       Persona persona = ipersonaRepository.findById(id).orElse(null);
       return persona;
    }
}
