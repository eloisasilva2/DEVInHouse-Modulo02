package service;

import java.util.ArrayList;
import java.util.List;

import model.*;


public class PessoaService {
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public void addPessoa(Pessoa pessoa) {
		pessoa.setId(System.currentTimeMillis());
		this.pessoas.add(pessoa);
	}
	
	public List<Pessoa>getPessoas(){
		return this.pessoas;
	}

}
