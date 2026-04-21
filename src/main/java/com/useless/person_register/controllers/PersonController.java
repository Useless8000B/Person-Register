package com.useless.person_register.controllers;

import com.useless.person_register.interfaces.PersonControllerInterface;
import com.useless.person_register.interfaces.PersonRepositoryInterface;
import com.useless.person_register.models.Person;

public class PersonController implements PersonControllerInterface{
	private static PersonController _instance;
	private PersonRepositoryInterface _personRepository;

	private PersonController(PersonRepositoryInterface personRepository) {
		this._personRepository = personRepository;
	}

	@Override
	public void getPeople() {
		this._personRepository.retrievePeople();
	}

	@Override
	public void addPerson(String name) {
		int id = (int) (System.currentTimeMillis() % 10000);
		Person newPerson = new Person(id, name);
		this._personRepository.createPerson(newPerson);
	}

	public static synchronized PersonController getInstance(PersonRepositoryInterface personRepository) {
		if(_instance == null) {
			_instance = new PersonController(personRepository);
		}

		return _instance;
	}
}
