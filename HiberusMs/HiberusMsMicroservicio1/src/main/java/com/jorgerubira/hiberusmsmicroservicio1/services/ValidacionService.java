/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsmicroservicio1.services;

import com.jorgerubira.hiberusmsmicroservicio1.dto.RolDto;
import com.jorgerubira.hiberusmsmicroservicio1.dto.UsuarioDto;
import com.jorgerubira.hiberusmsmicroservicio1.entities.Usuario;
import com.jorgerubira.hiberusmsmicroservicio1.repositories.UsuarioRepository;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.core.GrantedAuthorityDefaults;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ValidacionService implements UserDetailsService{

    @Autowired
    private UsuarioRepository repoUsu;
    
    @Autowired
    private ModelMapper mapper;
    
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Usuario> usuario=repoUsu.findByNombre(username);
        
        if (usuario.isPresent()){
            //UsuarioDto obj=mapper.map(usuario.get(), UsuarioDto.class);
            UsuarioDto obj=new UsuarioDto();
            obj.setNombre(usuario.get().getNombre());
            obj.setPassword(usuario.get().getPassword());
            List<RolDto> roles=usuario.get().getRoles()
                                      .stream()
                                      .map(x->new RolDto(x.getNombre()))
                                      .collect(Collectors.toList());
            obj.setRoles(roles);
            return obj;
        }else{
            throw new UsernameNotFoundException("Usuario/Password incorrecto");
        }
    }
    
}
