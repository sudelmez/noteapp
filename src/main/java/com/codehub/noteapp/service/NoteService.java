package com.codehub.noteapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.codehub.noteapp.dao.NoteModelDao;
import com.codehub.noteapp.exception.ServerException;
import com.codehub.noteapp.model.NoteModel;

public class NoteService {
    @Autowired 
    NoteModelDao noteDao;
    
    public List<NoteModel> getAll() {
		return noteDao.findAll();
	}

    public NoteModel save(NoteModel newNote) {
        try {
            return noteDao.save(newNote);
        } catch (Exception e) {
            System.err.println("Error while saving note data: " + e.getMessage());
            throw new ServerException();
        }
    }

    public void deleteAll(){
        try {
            noteDao.deleteAll();
        } catch (Exception e) {
            System.err.println("Error while deleting all list: " + e.getMessage());
            throw new ServerException();
        }
    }

    public void deleteById(long id){
        try {
            noteDao.deleteById(id);
        } catch (Exception e) {
            System.err.println("Error while deleting all list: " + e.getMessage());
            throw new ServerException();
        }
    }
}
