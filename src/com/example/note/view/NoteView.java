package com.example.note.view;

import com.example.note.model.Note;
import com.example.note.model.User;

import java.util.List;
import java.util.Scanner;

public class NoteView {

    private Scanner scanner = new Scanner(System.in);

    public String userInput(){
        System.out.print("Input -> ");
        return scanner.nextLine();
    }

    public void printNote(List<Note> notes) {
        if(!notes.isEmpty()){
            System.out.println("Here is all created Notes");
            System.out.println(notes);
        }else {
            System.out.println("Note List is empty, please create new Note to print it on screen!\n");
        }
    }

    public Note inputNote() {
        Note note = new Note();
        SetDataNote(note);

        return note;
    }

    public void editNote(List<Note> notes){
        if(!notes.isEmpty()){

            System.out.println("Enter Note label to find Note ->");
            String labelBuff = userInput();

            for (Note it : notes) {
                if (it.getLabel().equals(labelBuff)) {
                    SetDataNote(it);
                }else{
                    System.out.println("\nIn note list no label like that");
                }
            }
        } else {
            System.out.println("Note List is empty, please create new Note to edit it!\n");
        }
    }

    public void deleteNote(List<Note> notes){

        if(!notes.isEmpty()){
            System.out.println("Enter Note label to delete Note ->");
            String searchToDelete = userInput();

            notes.removeIf(note -> note.getLabel().equals(searchToDelete));

        }else{
            System.out.println("Note List is empty, please create new Note to edit it!\n");
        }
    }

    public void SetDataNote(Note note){

        System.out.println("Enter note text:");
        String noteText = userInput();

        System.out.println("Enter Label:");
        String labelText = userInput();

        System.out.println("Enter 1 if Note is checked, or 0 if Note is not checked");
        String checkedText = userInput();

        note.setNote(noteText);
        note.setLabel(labelText);
        note.setChecked("1".equals(checkedText));
        note.setDate("12.12.2020");
    }

    public boolean checkMailValidation(User user) {

        System.out.println("Enter email:");
        user.setEmail(userInput());

        return user.getEmail().matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9+])*(\\.[A-Za-z]{2,})$");
    }
}
