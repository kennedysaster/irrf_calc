package com.calculos.Impostos.controller;

import org.hibernate.internal.util.securitymanager.SystemSecurityManager;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(path = "/user") //criacao de uma api com esta anotacao e caminho da api
public class ControllerUser {

    //criar um metodo java
   @PostMapping //metodo post
    public ResponseEntity create(){ //devolve status http
        System.out.println("usuario criado com sucesso");
        return ResponseEntity.noContent().build();
    }
}
