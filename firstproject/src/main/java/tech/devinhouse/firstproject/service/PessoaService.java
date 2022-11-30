package tech.devinhouse.firstproject.service;

import org.springframework.stereotype.Service;
import tech.devinhouse.firstproject.model.PessoaModel;

import java.util.List;
import java.util.ArrayList;

@Service
public class PessoaService {

    private static List<PessoaModel> pessoaList = new ArrayList<PessoaModel>();



    public PessoaService(){

        PessoaModel pessoa1 = new PessoaModel(1L, "Pessoa 1", "pesssoa1@email.com.br");
        PessoaModel pessoa2 = new PessoaModel(2L, "Pessoa 2", "pesssoa2@email.com.br");
        pessoaList.add(pessoa1);
        pessoaList.add(pessoa2);

    }

    //Para retornar todas as pessoas
    public List<PessoaModel> getPessoas(){
        return pessoaList;
    }


    public void addPessoa(PessoaModel pessoa){
        pessoaList.add(pessoa);
    }

    public void postPessoa(PessoaModel pessoa){
        pessoaList.add(pessoa);
    }


    public boolean deleteById(Long id) {

        var isRemoved = this.pessoaList.removeIf(post -> post.getId().equals(id));

        return isRemoved;
    }

    public boolean updateById(Long id) {
        var modificado = this.pessoaList.removeIf(post -> post.getId().equals(id));

        return modificado;
    }
}
