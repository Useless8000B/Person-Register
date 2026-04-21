package com.useless.person_register.models;

public class Person implements BlankPerson{
	private int _id;
	private String _name;

	public Person(int id, String name) {
		this._id = id;
		this._name = name;
	}
	
	@Override
	public int getID() {
		return this._id;
	}

	@Override
	public String getName() {
		return this._name;
	}

	@Override
    public String toString() {
        return String.format("ID: %d\nNome: %s\n", this._id, this._name);
    }
}
