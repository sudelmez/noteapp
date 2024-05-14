package com.codehub.noteapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.codehub.noteapp.exception.ServerException;
import com.codehub.noteapp.model.NoteModel;
import com.codehub.noteapp.service.NoteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
public class NoteController {

    // @Autowired
    NoteService service;

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
      return String.format("Hello %s!", name);
    }

    @GetMapping("/notes")
	public ResponseEntity<List<NoteModel>> getAll() {
		return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
	}

    @PostMapping(path = "/notes",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<NoteModel> create(@RequestBody NoteModel newNote) {
		NoteModel note = service.save(newNote);
		if (note == null) {
			throw new ServerException();
		}
		else {
			return new ResponseEntity<>(note, HttpStatus.CREATED);
		}
	}

	@DeleteMapping(value = "/notes")
	@ResponseStatus(HttpStatus.OK)
	public String deleteAll() {
		service.deleteAll();
		return null;
	}

	@DeleteMapping(value = "/notes/{id}")
	@ResponseStatus(HttpStatus.OK)
	public long delete(@PathVariable(value = "id") long empId) {
  	 service.deleteById(empId);
	return empId;
 	}  
}
