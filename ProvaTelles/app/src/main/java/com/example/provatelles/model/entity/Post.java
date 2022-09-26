package com.example.provatelles.model.entity;

public class Post {
    private int id;
    private String title;
    private String description;
    private String content;
    private String author;
    private String create_time;
    private String update_time;
    private String create_date;
    private String update_date;
    private String reading_time;

    public Post(int id, String title, String description, String content, String author, String create_time, String update_time, String create_date, String update_date, String reading_time) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.content = content;
        this.author = author;
        this.create_time = create_time;
        this.update_time = update_time;
        this.create_date = create_date;
        this.update_date = update_date;
        this.reading_time = reading_time;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public String getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(String update_date) {
        this.update_date = update_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getReading_time() {
        return reading_time;
    }

    public void setReading_time(String reading_time) {
        this.reading_time = reading_time;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }
}


