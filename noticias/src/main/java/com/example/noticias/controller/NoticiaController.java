package com.example.noticias.controller;

import com.example.noticias.model.NoticiaEntity;
import com.example.noticias.service.NoticiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("noticiasereleases")
public class NoticiaController {
    @Autowired
    private NoticiaService noticiaService;

    @GetMapping
    public String getNoticiasERelease(){
        return noticiaService.getNoticiasERelease();
    }

    @GetMapping("noticias")
    public String getNoticias(){
        return noticiaService.getNoticia();
    }

    @GetMapping("releases")
    public String getRelease(){
        return noticiaService.getRelease();
    }
    @PostMapping
    public NoticiaEntity inserir(@RequestBody NoticiaEntity noticia){
        return noticiaService.inserirNoticia(noticia);
    }

}
