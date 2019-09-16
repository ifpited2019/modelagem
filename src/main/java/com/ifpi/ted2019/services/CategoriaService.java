package com.ifpi.ted2019.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifpi.ted2019.domain.Categoria;
import com.ifpi.ted2019.repositories.CategoriaRepository;
import com.ifpi.ted2019.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> object = repository.findById(id);
		return object.orElseThrow(()-> new ObjectNotFoundException(
				"Objeto não encontrado! Id: "+ id 
				+", Tipo: " + Categoria.class.getName()));
	}
}
