package com.codehub.noteapp.model;

import java.time.LocalDateTime;

public class NoteModel {
    private LocalDateTime dateTime;
    private String color;
    private String title;
    private String content;

    public NoteModel(LocalDateTime dateTime, String color, String title, String content) {
        this.dateTime = dateTime;
        this.color = color;
        this.title = title;
        this.content = content;
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
                "dateTime=" + dateTime +
                ", color='" + color + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
