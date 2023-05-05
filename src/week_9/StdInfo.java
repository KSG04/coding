package week_9;

public class StdInfo {
    private String name;
    private int number;
    private String score;

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public StdInfo(String name, int number) {
        this.name = name;
        this.number = number;
    }



}
