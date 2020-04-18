package com.example.note.controller;

import com.example.note.model.User;

import java.util.Scanner;

public class MainController {

    private NoteController noteController = new NoteController();
    private User user = new User();

    public User getUser() {
        return user;
    }

    public NoteController getNoteController() {
        return noteController;
    }

    public void Start(){

            System.out.println("All commands");
            for (String commandStr : noteController.getCommandList()){
                System.out.println(commandStr);
            }
            System.out.print("Enter command -> ");

            Scanner input = new Scanner(System.in);
            String command = input.nextLine();

            switch (command){
                case "exit":
                    System.out.println("Have a nice day");
                    System.exit(0);
                case "print":
                    noteController.getNoteView().printNote(noteController.getNotes());
                    break;
                default:
                    if(noteController.checkCommand(command)) {
                        noteController.doCommand(command);
                        break;
                    }else{
                        System.out.println("Incorrect command!\n");
                    }
            }

    }
}
