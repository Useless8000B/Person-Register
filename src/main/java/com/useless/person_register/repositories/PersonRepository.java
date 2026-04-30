package com.useless.person_register.repositories;

import com.useless.person_register.models.BlankPerson;

public interface PersonRepository {
	void retrievePeople();
	void createPerson(BlankPerson p);
}
