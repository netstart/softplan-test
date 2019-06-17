package com.example.pessoa.component;

import com.example.pessoa.document.Pessoa;
import com.example.pessoa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.UUID;

import static java.lang.System.out;

//@Component
public class DammyData implements CommandLineRunner {

//    @Autowired
    private PessoaRepository pessoaRepository;

    @Override
    public void run(String... args) throws Exception {
        pessoaRepository.deleteAll()
                .thenMany(
                        Flux.just(
                                "Clayton Passos", "Daniela Passos", "Catherine Nakahara", "Sophia Nakahara")
                                .map(nome -> new Pessoa(UUID.randomUUID().toString(), nome))
                                .flatMap(pessoaRepository::save))
                .subscribe(out::println);
    }
}
