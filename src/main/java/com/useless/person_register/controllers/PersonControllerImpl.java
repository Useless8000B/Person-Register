package com.useless.person_register.controllers;

import com.useless.person_register.models.Person;
import com.useless.person_register.repositories.PersonRepository;

public class PersonControllerImpl implements PersonController {
	private static PersonControllerImpl _instance;
	private PersonRepository _personRepository;

	private PersonControllerImpl(PersonRepository personRepository) {
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

	public static synchronized PersonControllerImpl getInstance(PersonRepository personRepository) {
		if(_instance == null) {
			_instance = new PersonControllerImpl(personRepository);
		}

		return _instance;
	}
}
