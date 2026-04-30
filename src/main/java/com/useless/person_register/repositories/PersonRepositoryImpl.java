package com.useless.person_register.repositories;

import java.util.ArrayList;
import java.util.List;

import com.useless.person_register.models.BlankPerson;

public class PersonRepositoryImpl implements PersonRepository {
	private static PersonRepositoryImpl _instance;
	private List<BlankPerson> people = new ArrayList<>();

	@Override
	public void retrievePeople() {
		for (BlankPerson person: people) {
			System.out.println(person);
		}
	}

	@Override
	public void createPerson(BlankPerson p) {
		this.people.add(p);
	}

	public static synchronized PersonRepositoryImpl getInstance() {
		if (_instance == null) {
			_instance = new PersonRepositoryImpl();
		}

		return _instance;
	}
}
