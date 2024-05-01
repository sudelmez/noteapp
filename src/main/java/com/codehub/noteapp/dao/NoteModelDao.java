package com.codehub.noteapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codehub.noteapp.model.NoteModel;

@Repository // Spring bileşeni olduğunu belirtir
public interface NoteModelDao extends JpaRepository<NoteModel, Long> {
}

// JpaRepository= CRUD (Create, Read, Update, Delete) işlemleri