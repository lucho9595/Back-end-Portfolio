package com.portfolio.Luciano.Controller;

import com.portfolio.Luciano.Dto.dtoProyects;
import com.portfolio.Luciano.Entity.Proyects;
import com.portfolio.Luciano.Security.Controller.Mensaje;
import com.portfolio.Luciano.Service.SProyects;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proyects")
@CrossOrigin(origins = {"https://portfolio-fb829.web.app", "http://localhost:4200"})
public class CProyects {
    @Autowired
    SProyects sProyects;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Proyects>> list() {
        List<Proyects> list = sProyects.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Proyects> getById(@PathVariable("id") int id) {
        if (!sProyects.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe tal persona"), HttpStatus.NOT_FOUND);
        }
        Proyects proyects = sProyects.getOne(id).get();
        return new ResponseEntity(proyects, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoProyects dtoproyects) {
        if (StringUtils.isBlank(dtoproyects.getNombre())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (sProyects.existsByNombre(dtoproyects.getNombre())) {
            return new ResponseEntity(new Mensaje("Esa persona existe"), HttpStatus.BAD_REQUEST);
        }

        Proyects proyects = new Proyects(dtoproyects.getNombre(), dtoproyects.getDescription(), dtoproyects.getImg());
        sProyects.save(proyects);

        return new ResponseEntity(new Mensaje("Persona agregada"), HttpStatus.OK);

    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoProyects dtoproyects) {
        //Aaca validamos si existe ese ID
        if (!sProyects.existsById(id)) {
            return new ResponseEntity(new Mensaje("El id no existe"), HttpStatus.BAD_REQUEST);
        }
        if (sProyects.existsByNombre(dtoproyects.getNombre()) && sProyects.getByNombre(dtoproyects.getNombre()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("Esa Persona ya existe"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(dtoproyects.getNombre())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        Proyects proyects = sProyects.getOne(id).get();
        proyects.setNombre(dtoproyects.getNombre());
        proyects.setDescription(dtoproyects.getDescription());
        proyects.setImg(dtoproyects.getImg());


        sProyects.save(proyects);
        return new ResponseEntity(new Mensaje("Persona actualizada"), HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sProyects.existsById(id)) {
            return new ResponseEntity(new Mensaje("El id no existe"), HttpStatus.BAD_REQUEST);
        }
        sProyects.delete(id);
        return new ResponseEntity(new Mensaje("Persona eliminada"), HttpStatus.OK);
    }
}
