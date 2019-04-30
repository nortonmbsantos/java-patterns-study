package com.norton.patterns_project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.norton.patterns_project.coffee.Coffee;
import com.norton.patterns_project.coffee.CoffeeFactory;
import com.norton.patterns_project.dtos.CoffeeDto;
import com.norton.patterns_project.exceptions.CoffeeException;
import com.norton.patterns_project.repository.CoffeeRepository;

@Service
public class CoffeeService {
	@Autowired
	private CoffeeRepository coffeeRepository;

	public List<Coffee> listar() {
		return coffeeRepository.findAll();
	}

	public Coffee salvar(CoffeeDto coffeeDto) {

		Coffee coffee = new CoffeeFactory().getCoffee(coffeeDto.getType());

		return coffeeRepository.save(coffee);
	}

	public Coffee buscar(Long id) {
		Coffee coffee = coffeeRepository.findOne(id);

		if (coffee == null) {
			throw new CoffeeException("Não existe este café cadastrado");
		}
		return coffee;
	}
}
