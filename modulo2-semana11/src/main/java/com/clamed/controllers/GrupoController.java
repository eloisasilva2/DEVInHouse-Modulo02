package com.clamed.controllers;

import com.clamed.dto.GrupoInput;
import com.clamed.dto.GrupoOutput;
import com.clamed.model.Grupo;
import com.clamed.service.CadastroGrupoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/grupos")
public class GrupoController {

    @Autowired
    private CadastroGrupoService cadastroGrupoService;

    @PostMapping
    public ResponseEntity<Grupo> cadastrar(@RequestBody Grupo grupo){
        return new ResponseEntity<Grupo>(cadastroGrupoService.salvar(grupo), HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Grupo>> getGrupoByName(@RequestParam(name = "nome")  Long id){
        List<Grupo> grupos = (List<Grupo>) cadastroGrupoService.getGrupoById(id);
        return new ResponseEntity<List<Grupo>>(grupos, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<GrupoOutput> atualizar(@RequestBody GrupoInput grupoInput){
        Grupo grupo = new Grupo();

        BeanUtils.copyProperties(grupoInput, grupo);
        Grupo g = cadastroGrupoService.salvar(grupo);

        GrupoOutput gr = new GrupoOutput();

        BeanUtils.copyProperties(g, gr);

        return new ResponseEntity<GrupoOutput>(gr, HttpStatus.OK);
    }

    @DeleteMapping
    @ResponseBody
    public ResponseEntity<String> delete(@RequestParam Long idGrupo){
        cadastroGrupoService.deleteById(idGrupo);
        return new ResponseEntity<String>("Contato ID: "+idGrupo+" deletado com sucesso", HttpStatus.OK);
    }

}
