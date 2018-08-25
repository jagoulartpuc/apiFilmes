package com.filme.filme.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.filme.filme.model.Filmes;
import com.filme.filme.repository.FilmesRepository;
@Service
public class FilmesService {

	@Autowired
	FilmesRepository filmesRepository;

	public List<Filmes> getAll() {
		return this.filmesRepository.findAll();

	}

	public Filmes add(Filmes filme) {
		return this.filmesRepository.save(filme);

	}

	public Filmes findByID(String filme) {
		return this.findByID(filme);
	}

}
