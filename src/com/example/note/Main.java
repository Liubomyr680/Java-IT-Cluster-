package com.example.note;

import com.example.note.controller.MainController;

public class Main {
    public static void main(String[] args) {
        MainController mainController = new MainController();

        while(true){
            if(mainController.getNoteController().getNoteView().checkMailValidation(mainController.getUser())){
                while(true){
                    mainController.Start();
                }
            }
        }


    }
}
