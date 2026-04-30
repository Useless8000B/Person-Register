package com.useless.person_register;

import com.useless.person_register.controllers.PersonController;
import com.useless.person_register.controllers.PersonControllerImpl;
import com.useless.person_register.repositories.PersonRepositoryImpl;
import com.useless.person_register.ui.UI;
import com.useless.person_register.ui.UIImpl;
import com.useless.person_register.utils.Format;

public class App {
    private static UI _UI = UIImpl.getInstance();
    private static PersonRepositoryImpl _personRepository = PersonRepositoryImpl.getInstance();
    private static PersonController _personConroller = PersonControllerImpl.getInstance(_personRepository);
    private static int option = 0;
    private static boolean running = true;

    public static void main(String[] args) {
        while (running) {
            Format.Line();
            _UI.showMenu();
            Format.Line();
            option = _UI.getOption();
            processCommand(option);
        }
    }

    public static void processCommand(int _option) {
        switch (_option) {
            case 1:
                String name = _UI.getPersonName();
                _personConroller.addPerson(name);
                break;
            case 2:
                Format.Line();
                _personConroller.getPeople();
                break;
            case 3:
                running = false;
                break;
            default:
                System.out.println("Not an option!");
                break;
        }
    }
}
