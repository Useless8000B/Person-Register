package com.useless.person_register.repositories;

import java.util.ArrayList;
import java.util.List;

import com.useless.person_register.interfaces.PersonRepositoryInterface;
import com.useless.person_register.models.BlankPerson;

public class PersonRepository implements PersonRepositoryInterface {
	private static PersonRepository _instance;
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

	public static synchronized PersonRepository getInstance() {
		if (_instance == null) {
			_instance = new PersonRepository();
		}

		return _instance;
	}
}
