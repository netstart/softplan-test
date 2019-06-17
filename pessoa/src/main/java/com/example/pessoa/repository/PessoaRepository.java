package com.example.pessoa.repository;

import com.example.pessoa.document.Pessoa;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import java.util.List;

public interface PessoaRepository extends ReactiveMongoRepository<Pessoa, String> {
    List<Pessoa> findByNome(String nome);

    // Pageable -> https://thepracticaldeveloper.com/2017/11/04/full-reactive-stack-with-spring-webflux-and-angularjs/
}
