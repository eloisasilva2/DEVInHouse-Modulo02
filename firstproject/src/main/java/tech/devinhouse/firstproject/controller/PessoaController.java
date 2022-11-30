package tech.devinhouse.firstproject.controller;

import org.springframework.web.bind.annotation.*;
import tech.devinhouse.firstproject.model.PessoaModel;
import tech.devinhouse.firstproject.service.PessoaService;

import java.util.List;


@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private PessoaService service;

    public PessoaController(PessoaService service){
        this.service = service;
    }

    @GetMapping()
    public List<PessoaModel> getPessoas() {

        return service.getPessoas();
    }


   // @GetMapping("/{id}")
   //public String byID(@PathVariable("id") String id){
     //  return id; }

    @PostMapping()
    public void postPessoa(@RequestBody PessoaModel pessoa){
       service.postPessoa(pessoa);
    }

    @DeleteMapping("/delete/{id}")
    public List<PessoaModel> byID(@PathVariable("id") Long id){
      service.deleteById(Long.valueOf(String.valueOf(id)));
        return service.getPessoas();}

    @PatchMapping("/update/{id}")
    public List<PessoaModel> byId(@PathVariable("id") Long id){
        service.updateById(Long.valueOf(String.valueOf(id)));
        return service.getPessoas();}

}
