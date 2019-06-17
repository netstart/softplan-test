package com.example.pessoa.controller;

import com.example.pessoa.document.Pessoa;
import com.example.pessoa.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController("api/pessoa/")
public class PessoaController {

    @Autowired
    PessoaService pessoaService;

    @GetMapping
    public Flux<Pessoa> pessoas() {
        return pessoaService.findAll();
    }

    @GetMapping("{id}")
    public Mono<Pessoa> pessoaId(@PathVariable String id) {
        return pessoaService.findById(id);
    }

    @PostMapping
    public Mono<Pessoa> save(Pessoa pessoa) {
        return pessoaService.save(pessoa);
    }

}
