package com.example.Teliko.model;

import org.junit.Assert;
import org.junit.Test;

public class QuizTest {

    @Test
    public void QuizAccounts(){
        Quiz quiz = new Quiz();
        Account acc = new Account();
        acc.setName("Nelson");
        quiz.setPlayer1(acc);
        Assert.assertEquals("Nelson",quiz.getPlayer1().getName());

    }

    @Test
    public void QuizDetails(){
        Quiz quiz = new Quiz();
        quiz.setTime1(21);
        Assert.assertEquals(21,quiz.getTime1());

        quiz.setScore1(3);
        Assert.assertEquals(3,quiz.getScore1());

        quiz.updateScore1(2);
        Assert.assertEquals(5,quiz.getScore1());

    }

    @Test
    public void quizQuestions(){
        Quiz quiz = new Quiz();
        QuestionSet questionSet = new QuestionSet();
        quiz.setQuestionSet(questionSet);
        Assert.assertTrue(quiz.getQuestionSet().equals(questionSet));


    }

    @Test
    public void winner(){
        Quiz quiz = new Quiz();
        Account acc1 = new Account();
        Account acc2 = new Account();
        acc1.setName("Paul");
        acc2.setName("Vin");
        quiz.setPlayer1(acc1);
        quiz.setPlayer2(acc2);
        quiz.setScore1(2);
        quiz.setScore2(4);
        quiz.setTime1(1);
        quiz.setTime2(1);
        Assert.assertEquals("Vin",quiz.winner().getName());


    }


}
