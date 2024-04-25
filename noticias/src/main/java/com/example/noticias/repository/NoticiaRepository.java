package com.example.noticias.repository;

import com.example.noticias.model.NoticiaEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NoticiaRepository extends MongoRepository<NoticiaEntity, String> {

}
