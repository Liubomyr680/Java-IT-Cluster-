package com.example.note.repositories;

import com.example.note.model.Note;

import java.util.ArrayList;
import java.util.List;

public class NoteRepository {
    private List<Note> notes;

    private static NoteRepository noteRepository = new NoteRepository();

    public NoteRepository() {
        notes = new ArrayList<>();
    }

    public static NoteRepository getInstance(){return noteRepository;}

    public List<Note> getNotes() {
        return notes;
    }
}
