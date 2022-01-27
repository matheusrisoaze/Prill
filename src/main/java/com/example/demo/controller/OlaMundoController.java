package com.example.demo.controller;

import com.example.demo.Pessoa;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping (path="/projetoprill")
public class OlaMundoController {
    @GetMapping (path="/get")
    public ResponseEntity<Object> olaMundo(){

        return new ResponseEntity<>("Ola Mundo!", HttpStatus.OK);
    }

    @PostMapping(path="/post")
    public ResponseEntity<Pessoa> enviar(@RequestBody Pessoa chama){

        return new ResponseEntity<Pessoa>(chama, HttpStatus.CREATED);
    }
}