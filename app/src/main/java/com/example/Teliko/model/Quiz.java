package com.example.Teliko.model;

public class Quiz {

    private Account player1;
    private Account player2;
    private int score1;
    private int score2;
    private int time1;
    private int time2;

    private QuestionSet questionSet = new QuestionSet();
    public Quiz(){}
    public Quiz(QuestionSet que, Account acc1, Account acc2){
        this.questionSet = que;
        this.player1 = acc1;
        this.player2 = acc2;
        this.score1 = 0;
        this.score2 = 0;
        this.time1 = 0;
        this.time2 = 0;
    }

    public void setPlayer1(Account player1) {
        this.player1 = player1;
    }

    public void setPlayer2(Account player2) {
        this.player2 = player2;
    }

    public void setQuestionSet(QuestionSet questionSet) {
        this.questionSet = questionSet;
    }

    public void setScore1(int score1) {
        this.score1 = score1;
    }

    public void setScore2(int score2) {
        this.score2 = score2;
    }

    public void updateQuestion(QuestionSet que){
        this.questionSet = que;
    }

    public Account getPlayer1() {
        return player1;
    }

    public Account getPlayer2() {
        return player2;
    }

    public void setTime1(int time1) {
        this.time1 = time1;
    }

    public void setTime2(int time2) {
        this.time2 = time2;
    }

    public int getTime1() {
        return time1;
    }

    public int getTime2() {
        return time2;
    }

    public void updateScore1(int score){
        this.score1 += score;
    }

    public void updateScore2(int score){
        this.score2 += score;
    }
    public int getScore1() {
        return score1;
    }

    public int getScore2() {
        return score2;
    }

    public QuestionSet getQuestionSet() {
        return questionSet;
    }

    public Account winner(){
        int x = score1 / time1;
        int y = score2 / time2;

        if(x > y){
            return player1;
        }else{
            if(x==y){
                return null;
            }else {
                return player2;
            }
        }
    }
}
