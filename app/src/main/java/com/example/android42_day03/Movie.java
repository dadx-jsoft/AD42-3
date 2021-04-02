package com.example.android42_day03;

public class Movie {

    private String name;
    private String category;
    private String description;
    private String hour;
    private int avatar;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public Movie(String name, String category, String description, String hour, int avatar) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.hour = hour;
        this.avatar = avatar;
    }
}
