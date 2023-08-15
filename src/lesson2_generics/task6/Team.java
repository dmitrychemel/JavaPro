package lesson2_generics.task6;

import java.util.ArrayList;
import java.util.List;

public class Team <T extends Human>{

    private String name;

    private List<T> team = new ArrayList<>();
    private int score = 0;

    public Team(String name) {
        this.name = name;
    }

    public void add(T teammate){
        team.add(teammate);
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", team=" + team +
                ", score=" + score +
                '}';
    }
}
