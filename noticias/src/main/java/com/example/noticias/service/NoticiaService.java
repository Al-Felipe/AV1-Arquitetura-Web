package com.example.noticias.service;

import com.example.noticias.model.NoticiaEntity;
import com.example.noticias.repository.NoticiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class NoticiaService {
    @Autowired
    private NoticiaRepository noticiaRepository;

    public String getNoticiasERelease(){
        String dadosNoticia = "";
        String apiURL = "https://servicodados.ibge.gov.br/api/v3/noticias";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiURL, String.class);

        if(responseEntity.getStatusCode().is2xxSuccessful()){
            dadosNoticia = responseEntity.getBody();
        } else {
            dadosNoticia = "Falha ao obter noticia e release";
        }

        return dadosNoticia;
    }

    public String getNoticia(){
        String dadosNoticia = "";
        String apiURL = "https://servicodados.ibge.gov.br/api/v3/noticias/?tipo=noticia";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiURL, String.class);

        if(responseEntity.getStatusCode().is2xxSuccessful()){
            dadosNoticia = responseEntity.getBody();
        } else {
            dadosNoticia = "Falha ao obter noticia";
        }

        return dadosNoticia;
    }

    public String getRelease(){
        String dadosNoticia = "";
        String apiURL = "https://servicodados.ibge.gov.br/api/v3/noticias/?tipo=release";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiURL, String.class);

        if(responseEntity.getStatusCode().is2xxSuccessful()){
            dadosNoticia = responseEntity.getBody();
        } else {
            dadosNoticia = "Falha ao obter release";
        }

        return dadosNoticia;
    }

    public NoticiaEntity inserirNoticia(NoticiaEntity noticiaEntity){
        return noticiaRepository.save(noticiaEntity);
    }


}
