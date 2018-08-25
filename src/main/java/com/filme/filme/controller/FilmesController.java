package com.filme.filme.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.filme.filme.model.Filmes;
import com.filme.filme.service.FilmesService;
@RestController
@RequestMapping(path="api/filmes")
public class FilmesController {
	
	@Autowired 
	FilmesService filmesService;
	
	@PostMapping("")
	public Filmes add(Filmes filme) {
		return filmesService.add(filme);
	}
	
	@GetMapping("")
	public List<Filmes> getAll(){
		return filmesService.getAll();
		
	}
}
