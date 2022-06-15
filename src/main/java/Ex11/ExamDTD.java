package Ex11;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ExamDTD {

    private String test;
    private int score;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
