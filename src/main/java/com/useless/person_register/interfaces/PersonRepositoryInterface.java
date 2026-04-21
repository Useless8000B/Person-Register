package com.useless.person_register.interfaces;

import com.useless.person_register.models.BlankPerson;

public interface PersonRepositoryInterface {
	void retrievePeople();
	void createPerson(BlankPerson p);
}
