package com.example.Teliko.model;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class QuestionTest {

    @Test
    public void details(){
        Account account = new Account();
        account.setName("Nick");
        Assert.assertEquals("Nick", account.getName());

        account.setPassword("123456789");
        Assert.assertEquals("123456789",account.getPassword());

        account.setScore(37);
        Assert.assertEquals(37,account.getScore());

        account.updateScore(1);
        Assert.assertEquals(38,account.getScore());

        account.OnlineStatus(true);
        Assert.assertTrue(account.getOnlineStatus());
    }

    @Test
    public void questionDetails()
    {
        Question question = new Question();
        question.setType("Multiple");
        Assert.assertEquals("Multiple",question.getType());

        question.setCategory("Cinema");
        Assert.assertEquals("Cinema",question.getCategory());

        question.setDifficulty("Easy");
        Assert.assertEquals("Easy",question.getDifficulty());

        question.setCorrectAnswer("Leonardo Dicaprio");
        Assert.assertEquals("Leonardo Dicaprio",question.getCorrectAnswer());

        question.setQuestion("Who's the best: ");
        Assert.assertEquals("Who's the best: ",question.getQuestion());
    }


    @Test
    public void IncorrectAnswers(){

        Question question = new Question();
        List<String> incorrect = new ArrayList<String>();
        incorrect.add("Bill Gates");
        incorrect.add("Peter Parker");
        incorrect.add("Katerina Papoutsaki");
        question.setIncorrectAnswers(incorrect);
        Assert.assertEquals(3,question.getIncorrectAnswers().size());

    }



}