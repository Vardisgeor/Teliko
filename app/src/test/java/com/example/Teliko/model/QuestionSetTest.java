package com.example.Teliko.model;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class QuestionSetTest {

    @Test
    public void responceCode(){
        QuestionSet questionSet = new QuestionSet();
        questionSet.setResponseCode(0);
        Assert.assertEquals(0,questionSet.getResponseCode());

    }

    @Test
    public void questions(){
        QuestionSet questionSet = new QuestionSet();
        Question question = new Question();
        ArrayList<Question> arr = new ArrayList<Question>();
        arr.add(question);
        questionSet.setResults(arr);
        Assert.assertEquals(1,questionSet.getResults().size());
    }
}
