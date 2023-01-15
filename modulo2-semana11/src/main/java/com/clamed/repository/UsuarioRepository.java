package com.clamed.repository;

import com.clamed.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query("from usuario c where upper(c.nome) like %?1%")
    ArrayList<Usuario> getContatosByName(String nome);

    List<Usuario> getUsuariosByName(String nome);
}
