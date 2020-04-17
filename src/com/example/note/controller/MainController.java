package com.example.note.controller;

import java.util.Scanner;

public class MainController {

    private NoteController noteController = new NoteController();


    public void doMainCommands(){

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
                    }
            }




    }
}
