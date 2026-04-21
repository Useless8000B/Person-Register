package com.useless.person_register.ui;

import java.util.Scanner;

import com.useless.person_register.interfaces.UiInterface;

public class UI implements UiInterface {
	private static UI _instance;
	private final Scanner input = new Scanner(System.in);

	private UI() {}

	@Override
	public void showMenu() {
		String[] menu = { "[1] Add person", "[2] See all people", "[3] Exit" };

		for (String option : menu) {
			System.out.println(option);
		}
	}

	@Override
	public int getOption() {
		System.out.print("Option: ");
		int option = input.nextInt();
		input.nextLine();

		return option;
	}

	@Override
	public String getPersonName() {
		System.out.print("Name: ");
		String name = input.nextLine();

		return name;
	}

	public static synchronized UI getInstance() {
		if (_instance == null) {
			_instance = new UI();
		}

		return _instance;
	}
}
