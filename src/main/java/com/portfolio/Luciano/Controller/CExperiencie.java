package com.portfolio.Luciano.Controller;

import com.portfolio.Luciano.Dto.dtoExperiencie;
import com.portfolio.Luciano.Entity.Experiencie;
import com.portfolio.Luciano.Security.Controller.Mensaje;
import com.portfolio.Luciano.Service.SExperiencie;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
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
@RequestMapping("/explab")
@CrossOrigin(origins = {"https://portfolio-fb829.web.app", "http://localhost:4200"})
public class CExperiencie {

    @Autowired
    SExperiencie sExperiencie;

    @GetMapping("/lista")
    public ResponseEntity<List<Experiencie>> list() {
        List<Experiencie> list = sExperiencie.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Experiencie> getById(@PathVariable("id") int id) {
        if (!sExperiencie.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe tal experiencia"), HttpStatus.NOT_FOUND);
        }
        Experiencie experiencie = sExperiencie.getOne(id).get();
        return new ResponseEntity(experiencie, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoExperiencie dtoexp) {
        if (StringUtils.isBlank(dtoexp.getNombreE())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (sExperiencie.existsByNombreE(dtoexp.getNombreE())) {
            return new ResponseEntity(new Mensaje("Esa experiencia existe"), HttpStatus.BAD_REQUEST);
        }

        Experiencie experiencie = new Experiencie(
                dtoexp.getNombreE(), 
                dtoexp.getDescripcionE(), 
                dtoexp.getInicioE(), 
                dtoexp.getFinE(),
                dtoexp.getImg(),
                dtoexp.getUrl_imagen());
        sExperiencie.save(experiencie);

        return new ResponseEntity(new Mensaje("Experiencia agregada"), HttpStatus.OK);

    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoExperiencie dtoexp) {
        //Aaca validamos si existe ese ID
        if (!sExperiencie.existsById(id)) {
            return new ResponseEntity(new Mensaje("El id no existe"), HttpStatus.BAD_REQUEST);
        }
        if (sExperiencie.existsByNombreE(dtoexp.getNombreE()) && sExperiencie.getByNombreE(dtoexp.getNombreE()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("Esa experiencia ya existe"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(dtoexp.getNombreE())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        Experiencie experiencie = sExperiencie.getOne(id).get();
        experiencie.setNombreE(dtoexp.getNombreE());
        experiencie.setDescripcionE(dtoexp.getDescripcionE());
        experiencie.setInicioE(dtoexp.getInicioE());
        experiencie.setFinE(dtoexp.getFinE());
        experiencie.setImg(dtoexp.getImg());
        experiencie.setUrl_imagen(dtoexp.getUrl_imagen());

        sExperiencie.save(experiencie);
        return new ResponseEntity(new Mensaje("Experiencia actualizada"), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sExperiencie.existsById(id)) {
            return new ResponseEntity(new Mensaje("El id no existe"), HttpStatus.BAD_REQUEST);
        }
        sExperiencie.delete(id);
        return new ResponseEntity(new Mensaje("Experiencia eliminada"), HttpStatus.OK);
    }
}
