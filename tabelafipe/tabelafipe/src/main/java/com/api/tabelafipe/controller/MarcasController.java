package com.api.tabelafipe.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/marcas")
public class MarcasController {
    @PostMapping
    public void criarMarca(String nome){

    }
}
