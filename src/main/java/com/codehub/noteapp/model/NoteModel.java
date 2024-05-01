package com.codehub.noteapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity //veritabanı olduğunu söyler
@Table(name = "note")
public class NoteModel {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY) otomatik id oluşturmak için. ama gerek yok
    private Long id;
    @Column(name = "dateTime")
    private LocalDateTime dateTime;
    @Column(name = "color")
    private String color;
    @Column(name = "title")
    private String title;
    @Column(name = "content")
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "NoteModel{" +
                "id=" + id +
                ", dateTime=" + dateTime +
                ", color='" + color + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
