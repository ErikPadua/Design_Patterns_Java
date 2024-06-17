package DesignPatterns.Proxy;

import DesignPatterns.Builder.Pessoa;
import DesignPatterns.Proxy.Solution.PessoaRepositoryProxy;

public class PessoaServiceProxy {

    private PessoaRepositoryProxy pessoaRepositoryProxy;

    public PessoaServiceProxy(PessoaRepositoryProxy pessoaRepositoryProxy){
        this.pessoaRepositoryProxy = pessoaRepositoryProxy;
    }

    public void save(Pessoa pessoa){
        pessoaRepositoryProxy.save(pessoa);
    }

    public Pessoa findById(Long id){
        return pessoaRepositoryProxy.findById(id);
    }
}
