package com.filme.filme.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.filme.filme.model.Filmes;
@Repository
public interface FilmesRepository extends MongoRepository <Filmes,String > {

}
