package com.mb.springbootldapauth.model;

public class Team {
    private Long id;
    private String name;
    private String abbrevation;

    public Team() {
    }

    public Team(Long id, String name, String abbrevation) {
        this.id = id;
        this.name = name;
        this.abbrevation = abbrevation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbrevation() {
        return abbrevation;
    }

    public void setAbbrevation(String abbrevation) {
        this.abbrevation = abbrevation;
    }
}
