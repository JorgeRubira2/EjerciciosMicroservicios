/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jorgerubira.hiberusmsmicroservicio1.repositories;

import com.jorgerubira.hiberusmsmicroservicio1.entities.Usuario;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{

    public Optional<Usuario> findByNombre(String username);
}
