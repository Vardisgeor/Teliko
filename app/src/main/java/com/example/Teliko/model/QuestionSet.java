package com.example.Teliko.model;

import java.util.ArrayList;


public class QuestionSet {
    private int responseCode;
    private ArrayList<Question> results;

    public QuestionSet() {}

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public ArrayList<Question> getResults() {
        return results;
    }

    public void setResults(ArrayList<Question> results) {
        this.results = results;
    }


}