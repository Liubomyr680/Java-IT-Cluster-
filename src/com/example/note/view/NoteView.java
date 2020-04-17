package com.example.note.view;

import com.example.note.model.Note;

import java.util.List;
import java.util.Scanner;

public class NoteView {

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

        Scanner input = new Scanner(System.in);
        System.out.println("Enter note text:");
        String noteText = input.nextLine();

        System.out.println("Enter Label:");
        String labelText = input.nextLine();

        System.out.println("Input is Note complete 1 is complete:");
        String checkedText = input.nextLine();

        // check input if needed

        note.setNote(noteText);
        note.setLabel(labelText);
        note.setChecked("1".equals(checkedText));
        note.setDate("12.12.2020");
        return note;
    }

    public List<Note> editNote(List<Note> notes){
        if(!notes.isEmpty()){

            System.out.println("Enter Note label to find Note ->");
            Scanner search = new Scanner(System.in);
            String labelBuff = search.nextLine().trim();

            for (Note it : notes) {
                if (it.getLabel().equals(labelBuff)) {
                    Scanner input = new Scanner(System.in);
                    System.out.println("Enter note text:");
                    String noteText = input.nextLine();

                    System.out.println("Enter Label:");
                    String labelText = input.nextLine();

                    System.out.println("Input is Note complete 1 is complete:");
                    String checkedText = input.nextLine();

                    it.setNote(noteText);
                    it.setLabel(labelText);
                    it.setChecked("1".equals(checkedText));
                    it.setDate("12.12.2020");
                }else{
                    System.out.println("\nIn note list no label like that");
                }
            }
        } else {
            System.out.println("Note List is empty, please create new Note to edit it!\n");
        }
        return notes;
    }

    public List<Note> deleteNote(List<Note> notes){

        if(!notes.isEmpty()){
            System.out.println("Enter Note label to delete Note ->");
            Scanner search = new Scanner(System.in);
            String searchToDelete = search.nextLine().trim();

            notes.removeIf(note -> note.equals(searchToDelete));

        }else{
            System.out.println("Note List is empty, please create new Note to edit it!\n");
        }

        return notes;
    }
}
