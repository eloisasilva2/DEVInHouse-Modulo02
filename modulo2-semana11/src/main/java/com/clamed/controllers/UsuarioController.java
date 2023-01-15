package com.clamed.controllers;

import com.clamed.dto.UsuarioInput;
import com.clamed.dto.UsuarioOutput;
import com.clamed.model.Usuario;
import com.clamed.service.CadastroUsuarioService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/contatos")
public class UsuarioController {

    @Autowired
    private CadastroUsuarioService CadastroUsuarioService;

    @PostMapping
    public ResponseEntity<UsuarioOutput> cadastrar(@RequestBody UsuarioInput contatoInput){
        // cria um objeto do tipo Entity
        Usuario contato = new Usuario();

        // Faz a conversão do DTO de entrada para Entity
        BeanUtils.copyProperties(contatoInput, contato);

        Usuario c = CadastroUsuarioService.salvar(contato);

        // Cria um objeto DTO de saída
        UsuarioOutput co = new UsuarioOutput();

        //Faz a conversão da Entity para DTO de saída
        BeanUtils.copyProperties(c, co);

        // Montamos a resposta da requisição
        return new ResponseEntity<UsuarioOutput>(co, HttpStatus.CREATED);
    }


    @PutMapping
    public ResponseEntity<UsuarioOutput> atualizar(@RequestBody UsuarioInput contatoInput){
        // cria um objeto Entity
        Usuario contato = new Usuario();

        // Faz a conversão do DTO de entrada para Entity
        BeanUtils.copyProperties(contatoInput, contato);
        Usuario c = CadastroUsuarioService.salvar(contato);

        // Cria um objeto DTO de saída
        UsuarioOutput co = new UsuarioOutput();

        //Faz a conversão de Entity para DTO de saída
        BeanUtils.copyProperties(c, co);

        // Montamos a resposta da requisição
        return new ResponseEntity<UsuarioOutput>(co, HttpStatus.OK);
    }

    @DeleteMapping
    @ResponseBody
    public ResponseEntity<String> delete(@RequestParam Long idContato){
        CadastroUsuarioService.deleteById(idContato);
        return new ResponseEntity<String>("Usuario ID: "+idContato+" deletado com sucesso", HttpStatus.OK);
    }

    // TODO fazer a conversão da resposta para DTO de saída
    @GetMapping
    public ResponseEntity<List<Usuario>> getContatoByName(@RequestParam(name = "nome") String nome){
        List<Usuario> contatos = CadastroUsuarioService.getUsuariosByName(nome.toUpperCase());
        return new ResponseEntity<List<Usuario>>(contatos, HttpStatus.OK);
    }








}
