package com.clamed.service;


import com.clamed.model.Usuario;
import com.clamed.repository.UsuarioRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CadastroUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    public static Usuario salvar(Usuario usuario){

        log.trace("Uma mensagem de TRACE");
        log.debug("Uma mensagem de DEBUG");
        log.info("Uma mensagem de INFO");
        log.warn("Uma mensagem de AVISO");
        log.error("Uma mesagem de ERRO");

        return usuarioRepository.save(usuario);
    }

    public void deleteById(Long idUsuario){
        usuarioRepository.deleteById(idUsuario);
    }

    public List<Usuario> getUsuariosByName(String nome){

        return usuarioRepository.getUsuariosByName(nome);
    }


}
