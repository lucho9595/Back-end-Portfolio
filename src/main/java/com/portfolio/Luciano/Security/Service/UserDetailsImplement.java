package com.portfolio.Luciano.Security.Service;

import com.portfolio.Luciano.Security.Entity.Usuario;
import com.portfolio.Luciano.Security.Entity.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsImplement implements UserDetailsService {

    @Autowired
    UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        Usuario usuario = usuarioService.getByNombreUsuario(nombreUsuario).get();
        //build sirve para construir, en este caso retornamos un UsuarioPrincipal con los datos que vienen
        //de usuario
        return UsuarioPrincipal.build(usuario);
    }
}
