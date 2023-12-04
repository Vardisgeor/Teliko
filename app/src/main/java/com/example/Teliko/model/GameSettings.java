package com.example.Teliko.model;

public class GameSettings {

    private String difficulty;
    private String category;
    public  GameSettings(){}
    public GameSettings(String dif,String cat){
        this.difficulty=dif;
        this.category=cat;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getCategory() {
        return category;
    }

    public String getDifficulty() {
        return difficulty;
    }

}
