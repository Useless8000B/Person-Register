package com.useless.person_register.ui;

import java.util.Scanner;

public class UIImpl implements UI {
	private static UIImpl _instance;
	private final Scanner input = new Scanner(System.in);

	private UIImpl() {}

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

	public static synchronized UIImpl getInstance() {
		if (_instance == null) {
			_instance = new UIImpl();
		}

		return _instance;
	}
}
