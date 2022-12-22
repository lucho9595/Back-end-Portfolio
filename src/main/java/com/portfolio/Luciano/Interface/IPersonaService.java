package com.portfolio.Luciano.Interface;

import com.portfolio.Luciano.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //traes una lista de personas
    public List<Persona> getPersona();

    //guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar una persona y lo hacemos por id
    public Persona findPersona(Long id);
    
}

