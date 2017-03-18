package org.launchcode.java.quizTime;

/**
 * Created by kevinstock on 3/18/17.
 */
public class TrueFalse extends Question {

    private boolean answer;

    public TrueFalse(String question, boolean answer) {
        super(question);
        this.answer = answer;
    }

    public String displayQuestion() {
        return question;
    }

    public String toString() {
        return question + "\n" +
                "\t" + answer;
    }
}
