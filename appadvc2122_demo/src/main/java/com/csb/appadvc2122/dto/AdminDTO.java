package com.csb.appadvc2122.dto;

import com.csb.appadvc2122.model.Admin;

public class AdminDTO {

    private Long id;

    private String volunteerName;

    private String day;

    private String location;

    private String time;

    public AdminDTO() {}

    public AdminDTO(Long id, String volunteerName, String day, String location, String time) {
        this.id = id;
        this.volunteerName = volunteerName;
        this.day = day;
        this.location = location;
        this.time = time;
    }

    public AdminDTO (Admin user){
        this.id = user.getId();
        this.volunteerName = user.getVolunteerName();
        this.day = user.getDay();
        this.location = user.getLocation();
        this.time = user.getTime();
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getVolunteerName() { return volunteerName; }

    public void setVolunteerName(String volunteerName) { this.volunteerName = volunteerName; }

    public String getDay() { return day; }

    public void setDay(String day) { this.day = day; }

    public String getLocation() { return location; }

    public void setLocation(String location) { this.location = location; }

    public String getTime() { return time; }

    public void setTime(String time) { this.time = time; }
}