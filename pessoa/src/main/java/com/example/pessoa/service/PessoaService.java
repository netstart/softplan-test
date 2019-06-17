package com.example.pessoa.service;

import com.example.pessoa.document.Pessoa;
import com.example.pessoa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PessoaService {

    @Autowired
    PessoaRepository pessoaRepository;

    public Flux<Pessoa> findAll() {
        return pessoaRepository.findAll();
    }

    public Mono<Pessoa> findById(String id) {
        return pessoaRepository.findById(id);
    }

    public Mono<Pessoa> save(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }
}
