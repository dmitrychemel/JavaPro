package lesson2_generics.task6;

import java.util.Random;

public class Game {

    public <T extends Human> void play(Team<T> team1, Team<T> team2) {
        Random random = new Random();
        if (random.nextBoolean()) {
            team1.setScore(team1.getScore() + 1);
            System.out.println("Win - " + team1);
        } else {
            team2.setScore(team2.getScore() + 1);
            System.out.println("Win - " + team2);
        }
    }

    public void compareAll(Team<? extends Human> team1, Team<? extends Human> team2){
        if(team1.getScore() > team2.getScore()) {
            System.out.println("Win - " + team1);
        } else if (team1.getScore() == team2.getScore()) {
            System.out.println("Draw");
        } else {
            System.out.println("Win - " + team2);
        }
    }
}
