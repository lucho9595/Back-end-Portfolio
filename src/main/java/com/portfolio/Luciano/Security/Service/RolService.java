package com.portfolio.Luciano.Security.Service;

import com.portfolio.Luciano.Security.Entity.Rol;
import com.portfolio.Luciano.Security.Enums.RolNombre;
import com.portfolio.Luciano.Security.Repository.IRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//nos da la seguridad que los datos que tenemos aca vamos a tener en la base de datos
//esto se llama persistencia, hace un callback que hace que el estado se mantenga
//en el caso de un desperfecto este en un estado anterior
@Transactional
public class RolService {
    @Autowired
    IRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    //lo hacemos para guardar los cambios
    //void quiere que no devuelve nada
    public void save(Rol rol){
        irolRepository.save(rol);
    }      
}
