package com.example.note.controller;

import com.example.note.model.Note;
import com.example.note.repositories.NoteRepository;
import com.example.note.view.NoteView;

import java.util.List;

public class NoteController {

    private List<Note> notes = NoteRepository.getInstance().getNotes();
    private NoteView noteView = new NoteView();
    private String[] commandList = {"create","edit","delete","print"};

    private void enterNote(){

        notes.add(noteView.inputNote());
    }

    public boolean checkCommand(String command) {
        boolean isExistingCommand = false;

        for(String commandStr: commandList) {
            if (command.equals(commandStr)) {
                isExistingCommand = true;
            }
        }

        return  isExistingCommand;
    }

    public void doCommand(String command){

        switch (command){
            case "create":
                enterNote();
                break;
            case "edit":
                noteView.editNote(notes);
                break;
            case "delete":
                noteView.deleteNote(notes);
        }
    }

    public List<Note> getNotes() {
        return notes;
    }

    public NoteView getNoteView() {
        return noteView;
    }

    public String[] getCommandList() {
        return commandList;
    }
}
